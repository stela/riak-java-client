/*
 * This file is provided to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.basho.riak.newapi;

import com.basho.riak.newapi.bucket.Bucket;
import com.basho.riak.newapi.bucket.FetchBucket;
import com.basho.riak.newapi.bucket.WriteBucket;
import com.basho.riak.newapi.query.LinkWalk;
import com.basho.riak.newapi.query.MapReduce;

/**
 * @author russell
 * 
 */
public interface RiakClient {

    RiakClient setClientId(byte[] clientId) throws RiakException;

    byte[] generateAndSetClientId() throws RiakException;

    byte[] getClientId() throws RiakException;

    FetchBucket fetchBucket(String bucketName);

    WriteBucket updateBucket(Bucket b);

    WriteBucket createBucket(String string);

    // query - links
    LinkWalk walk(final RiakObject startObject);

    // query - m/r
    MapReduce mapReduce();
}
