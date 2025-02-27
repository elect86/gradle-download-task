// Copyright 2013-2020 Michel Kraemer
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
package de.undercouch.gradle.tasks.download.internal

import org.gradle.api.file.ProjectLayout
import java.io.File
import javax.inject.Inject

/**
 * Provides access to the [Project] API for Gradle 4.3 and later
 * @author Paul Merlin
 */
internal class DefaultProjectApiHelper
/**
 * Create the API helper
 * @param layout the project's layout
 */ @Inject constructor(private val layout: ProjectLayout) : ProjectApiHelper() {

    override val buildDirectory: File
        get() = layout.buildDirectory.get().asFile

    override fun file(path: String): File = layout.projectDirectory.file(path).asFile
}