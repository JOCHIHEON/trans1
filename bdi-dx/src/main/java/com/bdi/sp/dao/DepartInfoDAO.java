package com.bdi.sp.dao;

import java.util.List;

import com.bdi.sp.vo.Depart;

public interface DepartInfoDAO {
	public List<Depart> getDepartList(Depart d);
	public Depart getDepart(int dino);
	public int insertDepart(Depart d);
	public int deleteDepart(int dino);
	public int updateDepart(Depart d);

}
