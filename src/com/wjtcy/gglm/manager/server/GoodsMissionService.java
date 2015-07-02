package com.wjtcy.gglm.manager.server;

import java.util.List;

import com.wjtcy.gglm.manager.show.GoodsMissionShow;

public interface GoodsMissionService {

	public List<GoodsMissionShow> getGoodsMissionList( int pageNo ,int pageSize ) ;
}
