package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.model.Location;
import com.app.service.ILocationService;
@Controller
public class LocationController {
	
	@Autowired
	private ILocationService service;
	
	
	/*
	@RequestMapping("/url") //GET
	public String ____(___){
		return "PageName";
	}*/
	
	//1. Show Register Page
	@RequestMapping("/regLoc")
	public String showReg(){
		return "LocationRegister";
	}
	
	//2. Insert Data on click submit
	@RequestMapping(value="/saveLoc",
			 method=RequestMethod.POST)//POST
	public String insertLoc(@ModelAttribute("location")Location loc,ModelMap map){
		
		int locId=service.saveLocation(loc);
		String info="Saved with :"+locId;
		map.addAttribute("msg", info);
		
		return "LocationRegister";
	}
	
	
	
	//3. Display Data On click View All
	@RequestMapping("/getAllLocs")
	public String getAllLocations(ModelMap map){
		List<Location> list=service.getAllLocations();
		map.addAttribute("locs",list);
		return "LocationData";
	}
	
	//4. On click DELETE , remove record
	@RequestMapping("/deleteLoc")
	public String delLoc(@RequestParam("locId")int locId){
		service.deleteLocation(locId);
		return "redirect:getAllLocs";
	}
	
	
	//5. Show Edit Page
	@RequestMapping("/editLoc")
	public String showEdit(@RequestParam("locId")int locId,ModelMap map){
		Location loc=service.getLocationById(locId);
		map.addAttribute("loc",loc);
		return "LocationDataEdit";
	}
	
	
	
	//6. Do Update Data
	@RequestMapping(value="/updateLoc",method=RequestMethod.POST)
	public String updateLoc(@ModelAttribute("location")Location loc){
		service.updateLocation(loc);
		return "redirect:getAllLocs";
	}
	
	@RequestMapping("/locExcelExport")
	public String exportExcel(ModelMap map){
		List<Location> locList=service.getAllLocations();
		map.addAttribute("locListObj",locList);
		return "LocExcelView";
	}
	/**
	 * 8. PDF Data export same as Excel
	 * @param map
	 * @return
	 */
	@RequestMapping("/locPdfExport")
	public String exportToPdf(ModelMap map){
		List<Location> locList=service.getAllLocations();
		map.addAttribute("locListObj",locList);
		return "LocPdfView";
	}
	/**
	 * 9. Report Design
	 *//*
	@RequestMapping("/locReport")
	public String showReport(){
		List<Object[]> data=service.getLocationwiseCount();
		String path=context.getRealPath("/");
		locUtil.generatePieLoc(path, data);
		locUtil.generateBarLoc(path, data);
		return "ReportLoc";
	}*/
	
	
	
	
	
	
}
