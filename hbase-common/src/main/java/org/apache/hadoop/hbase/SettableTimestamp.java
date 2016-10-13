/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.hadoop.hbase;

import java.io.IOException;

import org.apache.hadoop.hbase.classification.InterfaceAudience;

/**
 * Using this Interface one can mark a Cell as timestamp changeable. <br>
 * Note : Server side Cell implementations in write path must implement this.
 * @deprecated as of 2.0 and will be removed in 3.0. Use {@link ExtendedCell} instead
 */
@InterfaceAudience.LimitedPrivate(HBaseInterfaceAudience.COPROC)
@Deprecated
public interface SettableTimestamp {

  /**
   * Sets with the given timestamp.
   * @param ts
   */
  void setTimestamp(long ts) throws IOException;

  /**
   * Sets with the given timestamp.
   * @param ts buffer containing the timestamp value
   * @param tsOffset offset to the new timestamp
   */
  void setTimestamp(byte[] ts, int tsOffset) throws IOException;
}