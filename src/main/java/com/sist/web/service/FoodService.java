package com.sist.web.service;
import java.util.*;

import org.springframework.data.repository.query.Param;

import com.sist.web.dao.*;
import com.sist.web.vo.*;
import com.sist.web.entity.*;
public interface FoodService {
	public List<FoodListVO> foodListData(int start,int end);
	public FoodEntity FoodDetailData(int fno);
	public int foodTotalpage();
}
