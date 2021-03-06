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
package com.aliyuncs.itaas.transform.v20170505;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.itaas.model.v20170505.GetWelcomePageURIResponse;
import com.aliyuncs.itaas.model.v20170505.GetWelcomePageURIResponse.ErrorMessage;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetWelcomePageURIResponseUnmarshaller {

	public static GetWelcomePageURIResponse unmarshall(GetWelcomePageURIResponse getWelcomePageURIResponse, UnmarshallerContext context) {
		
		getWelcomePageURIResponse.setRequestId(context.stringValue("GetWelcomePageURIResponse.RequestId"));
		getWelcomePageURIResponse.setData(context.stringValue("GetWelcomePageURIResponse.Data"));
		getWelcomePageURIResponse.setErrorCode(context.integerValue("GetWelcomePageURIResponse.ErrorCode"));
		getWelcomePageURIResponse.setErrorMsg(context.stringValue("GetWelcomePageURIResponse.ErrorMsg"));
		getWelcomePageURIResponse.setSuccess(context.booleanValue("GetWelcomePageURIResponse.Success"));

		List<ErrorMessage> errorListList = new ArrayList<ErrorMessage>();
		for (int i = 0; i < context.lengthValue("GetWelcomePageURIResponse.ErrorList.Length"); i++) {
			ErrorMessage errorMessage = new ErrorMessage();
			errorMessage.setErrorMessage(context.stringValue("GetWelcomePageURIResponse.ErrorList["+ i +"].ErrorMessage"));

			errorListList.add(errorMessage);
		}
		getWelcomePageURIResponse.setErrorList(errorListList);
	 
	 	return getWelcomePageURIResponse;
	}
}