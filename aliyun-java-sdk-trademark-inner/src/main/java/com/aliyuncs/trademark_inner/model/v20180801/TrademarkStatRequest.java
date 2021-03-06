/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.trademark_inner.model.v20180801;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class TrademarkStatRequest extends RpcAcsRequest<TrademarkStatResponse> {
	
	public TrademarkStatRequest() {
		super("Trademark-inner", "2018-08-01", "TrademarkStat", "trademark", "innerAPI");
	}

	private String item;

	private Integer searchType;

	private Integer statType;

	private String keyword;

	private String classification;

	private Integer status;

	public String getItem() {
		return this.item;
	}

	public void setItem(String item) {
		this.item = item;
		if(item != null){
			putQueryParameter("Item", item);
		}
	}

	public Integer getSearchType() {
		return this.searchType;
	}

	public void setSearchType(Integer searchType) {
		this.searchType = searchType;
		if(searchType != null){
			putQueryParameter("SearchType", searchType.toString());
		}
	}

	public Integer getStatType() {
		return this.statType;
	}

	public void setStatType(Integer statType) {
		this.statType = statType;
		if(statType != null){
			putQueryParameter("StatType", statType.toString());
		}
	}

	public String getKeyword() {
		return this.keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
		if(keyword != null){
			putQueryParameter("Keyword", keyword);
		}
	}

	public String getClassification() {
		return this.classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
		if(classification != null){
			putQueryParameter("Classification", classification);
		}
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status.toString());
		}
	}

	@Override
	public Class<TrademarkStatResponse> getResponseClass() {
		return TrademarkStatResponse.class;
	}

}
