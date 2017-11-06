package com.oxande.vinci.vm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The virtual machine state. Currently not used.
 * 
 * @author wrey75
 *
 */
public class VinciState {

	 List<Object> stack = new ArrayList<>();
     Map<String, Object> vars = new HashMap<>();

}
