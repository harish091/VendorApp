package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.model.Vendor;
import com.app.service.IVendorService;

@Controller
public class VendorController {
	
	@Autowired
	private IVendorService serv;
	
	@RequestMapping("/regVen")
	public String showVen()
	{
		return "VendorRegister";
	}
	
	@RequestMapping(value="/saveVen",method=RequestMethod.POST)
	public String saveVendor(@ModelAttribute("venObj")Vendor ven,ModelMap map)
	{
		int venId=serv.saveVendor(ven);
		String msg="vendor id is saved with"+venId;
		map.addAttribute("value", msg);
		return "VendorRegister";
	}
	@RequestMapping("/getAllVens")
	public String totalVendor(ModelMap map)
	{
		List<Vendor> vData=serv.getAllVendors();
		map.addAttribute("vObj", vData);
		return "VendorData";
	}
	@RequestMapping("/deleteVen")
	public String deleteVendor(@RequestParam("venId")int venId)
	{
		serv.deleteVendor(venId);
		return "redirect:getAllVens";
	}
	
	@RequestMapping("/editVen")
	public String showEdit(@RequestParam("venId")int venId,ModelMap map){
		Vendor ven=serv.getVendorById(venId);
		map.addAttribute("ven",ven);
		return "VendorDataEdit";
	}
	
	@RequestMapping(value="/updateVen",method=RequestMethod.POST)
	public String updateLoc(@ModelAttribute("Vendor")Vendor ven){
        serv.updateVendor(ven);
		return "redirect:getAllVens";
	}

}
