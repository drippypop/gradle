/*
 * Copyright 2023 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.gradle.internal.work;

import org.gradle.internal.service.scopes.Scopes;
import org.gradle.internal.service.scopes.ServiceScope;

@ServiceScope(Scopes.BuildSession.class)
public interface ProjectParallelExecutionController {
    /**
     * Indicate that project execution may happen.
     *
     * <p>Note: this must be called prior to any projects being created for a build tree.</p>
     */
    void startProjectExecution(boolean parallel);

    /**
     * Indicate that project execution is complete.
     *
     * <p>Note: this must be called after all projects for the build tree have been discarded.</p>
     */
    void finishProjectExecution();
}
