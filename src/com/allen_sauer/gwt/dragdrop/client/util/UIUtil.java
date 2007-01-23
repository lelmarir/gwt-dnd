/*
 * Copyright 2006 Fred Sauer
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.allen_sauer.gwt.dragdrop.client.util;

import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Element;

/**
 * Library utility methods.
 */
public class UIUtil {

  // TODO enhancement request to remove absolute position when child element
  // is orphaned
  // http://code.google.com/p/google-web-toolkit/issues/detail?id=616
  public static void positionStatic(Element element) {
    DOM.setStyleAttribute(element, "left", "");
    DOM.setStyleAttribute(element, "top", "");
    DOM.setStyleAttribute(element, "position", "static");
  }

}