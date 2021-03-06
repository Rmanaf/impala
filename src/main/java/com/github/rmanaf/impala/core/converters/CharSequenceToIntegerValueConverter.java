/**
 *    Copyright (C) 2018 Arman Afzal <arman.afzal@gmail.com>
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package com.github.rmanaf.impala.core.converters;

import com.github.rmanaf.impala.core.ValueConverter;

public class CharSequenceToIntegerValueConverter extends ValueConverter<CharSequence , Integer> {

    @Override
    public Integer convert(CharSequence value) {

        return Integer.parseInt(value.toString());

    }

    @Override
    public CharSequence convertBack(Integer value) {

        return String.valueOf(value);

    }

}
