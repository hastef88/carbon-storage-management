/*
 *  Copyright (c) 2013, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 *
 */

package org.wso2.carbon.rssmanager.core.exception;

public class EntityNotFoundException extends RuntimeException {
    
    private String errorMessage;
    private static final long serialVersionUID = 2021891706072918874L;

    public EntityNotFoundException(String message, Exception nestedEx) {
        super(message, nestedEx);
        setErrorMessage(message);
    }

    public EntityNotFoundException(String message, Throwable cause) {
        super(message, cause);
        setErrorMessage(message);
    }

    public EntityNotFoundException(String message) {
        super(message);
        setErrorMessage(message);
    }

    public EntityNotFoundException(Throwable cause) {
        super(cause);
    }

    public EntityNotFoundException() {
        super();
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

}
