/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.olingo.server.api;

import java.util.Locale;

import org.apache.olingo.commons.api.ODataException;

public class ODataApplicationException extends ODataException {

  private static final long serialVersionUID = 5358683245923127425L;
  private int statusCode = 500;
  private Locale locale;
  private String oDataErrorCode;

  public ODataApplicationException(final String msg, int statusCode, Locale locale) {
    super(msg);
    this.statusCode = statusCode;
    this.locale = locale;
  }

  public ODataApplicationException(final String msg, int statusCode, Locale locale, String oDataErrorCode) {
    super(msg);
    this.statusCode = statusCode;
    this.locale = locale;
    this.oDataErrorCode = oDataErrorCode;
  }

  public ODataApplicationException(final String msg, int statusCode, Locale locale, final Throwable cause) {
    super(msg, cause);
    this.statusCode = statusCode;
    this.locale = locale;
  }

  public ODataApplicationException(final String msg, int statusCode, Locale locale, final Throwable cause,
      String oDataErrorCode) {
    super(msg, cause);
    this.statusCode = statusCode;
    this.locale = locale;
    this.oDataErrorCode = oDataErrorCode;
  }

  public int getStatusCode() {
    return statusCode;
  }

  public Locale getLocale() {
    return locale;
  }

  public String getODataErrorCode() {
    return oDataErrorCode;
  }
}
