/*
 * Copyright 2016-2020 the original author or authors from the JHipster project.
 *
 * This file is part of the JHipster project, see https://www.jhipster.tech/
 * for more information.
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

package az.ingress.common.criteria.filter;

/**
 * Class for filtering attributes with {@link Boolean} type. It can be added to a criteria class as a member, to support
 * the following query parameters:
 * <pre>
 *      fieldName.equals=true
 *      fieldName.notEquals=true
 *      fieldName.specified=true
 *      fieldName.specified=false
 *      fieldName.in=true,false
 *      fieldName.notIn=true,false
 * </pre>
 */
public class BooleanFilter extends Filter<Boolean> {

    private static final long serialVersionUID = 1L;

    public BooleanFilter() {
        // Empty constructor for BooleanFilter.
    }

    public BooleanFilter(final BooleanFilter filter) {
        super(filter);
    }

    @Override
    public BooleanFilter copy() {
        return new BooleanFilter(this);
    }

}
