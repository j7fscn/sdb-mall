package io.sdb.model;

import io.sdb.model.base.BaseSysMenu;
import lombok.Data;

import java.util.List;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
@Data
public class SysMenu extends BaseSysMenu<SysMenu> {
	public static final SysMenu dao = new SysMenu().dao();

	String parentName;
	List<SysMenu> list;
	boolean open;
}
