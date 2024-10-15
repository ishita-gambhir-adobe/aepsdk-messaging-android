/*
  Copyright 2024 Adobe. All rights reserved.
  This file is licensed to you under the Apache License, Version 2.0 (the "License");
  you may not use this file except in compliance with the License. You may obtain a copy
  of the License at http://www.apache.org/licenses/LICENSE-2.0
  Unless required by applicable law or agreed to in writing, software distributed under
  the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR REPRESENTATIONS
  OF ANY KIND, either express or implied. See the License for the specific language
  governing permissions and limitations under the License.
*/

package com.adobe.marketing.mobile.aepcomposeui.aepui.state

import org.junit.Assert.assertEquals
import org.junit.Test

class AepCardUIStateTests {

    @Test
    fun test_AepCardUIState_defaultState() {
        val state = AepCardUIState()
        assertEquals(false, state.dismissed)
        assertEquals(false, state.selected)
        assertEquals(false, state.read)
    }

    @Test
    fun test_AepCardUIState_createState() {
        val state = AepCardUIState(dismissed = true, selected = true, read = true)
        assertEquals(true, state.dismissed)
        assertEquals(true, state.selected)
        assertEquals(true, state.read)
    }
}
