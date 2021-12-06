/*   Copyright 2021 NEC Corporation
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package exastro.Exastro_Days_Tokyo.speaker_user.repository;

import org.springframework.web.client.RestTemplate;

public abstract class BaseRepository {
	
	protected final RestTemplate restTemplate;
	
	protected String protocol;
	protected String host;
	protected String port;
	
	protected BaseRepository(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}
	
	protected String buildBaseUri() {
		
		String baseUri = String.format("%s://%s:%s", this.protocol, this.host, this.port);
		return baseUri;
	}

}
