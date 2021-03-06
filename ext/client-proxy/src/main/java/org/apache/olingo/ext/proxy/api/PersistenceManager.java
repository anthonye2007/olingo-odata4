/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.olingo.ext.proxy.api;

import java.io.Serializable;
import java.util.List;
import java.util.concurrent.Future;
import org.apache.olingo.commons.api.ODataRuntimeException;

/**
 * Interface for container operations.
 */
public interface PersistenceManager extends Serializable {

  /**
   * Flushes all pending changes to the OData service.
   *
   * @return a list where n-th item is either null (if corresponding request went out successfully) or the exception
   * bearing the error returned from the service.
   */
  List<ODataRuntimeException> flush();

  /**
   * Asynchronously flushes all pending changes to the OData service.
   *
   * @return a future handle for a list where n-th item is either null (if corresponding request went out successfully)
   * or the exception bearing the error returned from the service.
   */
  Future<List<ODataRuntimeException>> flushAsync();
}
