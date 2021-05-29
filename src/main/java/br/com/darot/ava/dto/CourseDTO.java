/*
 * Copyright 2021 - Dário Teodoro
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package br.com.darot.ava.dto;

import br.com.darot.ava.models.Course;
import lombok.Data;

@Data
public class CourseDTO {

	private Long id;
	private String name;
	private String nickname;
	private int duration;

	public static CourseDTO convert(Course course) {
		var dto = new CourseDTO();
		dto.setId(course.getId());
		dto.setName(course.getName());
		dto.setNickname(course.getNickname());
		dto.setDuration(course.getDuration());
		return dto;
	}
}
