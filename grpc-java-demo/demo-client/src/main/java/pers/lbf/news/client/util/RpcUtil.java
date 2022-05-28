/*
 * Copyright 2020 赖柄沣 bingfengdev@aliyun.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package pers.lbf.news.client.util;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import static pers.lbf.news.client.constants.ServerConstants.SERVER_HOST;
import static pers.lbf.news.client.constants.ServerConstants.SERVER_PORT;

/**
 * TODO
 *
 * @author 赖柄沣 bingfengdev@aliyun.com
 * @version 1.0
 * @date 2022/5/29 0:47
 */
public final class RpcUtil {

    private static final ManagedChannel CHANNEL;

    static {
        CHANNEL = ManagedChannelBuilder
                .forAddress(SERVER_HOST, SERVER_PORT)
                .usePlaintext()
                .build();
    }

    public static ManagedChannel getManagedChannel() {
        if (null != CHANNEL) {
            return CHANNEL;
        }

        throw new IllegalStateException("channel creation failed");
    }
}
