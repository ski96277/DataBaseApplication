<?xml version="1.0" encoding="utf-8"?>
<!--
     Copyright (C) 2019 The Android Open Source Project

     Licensed under the Apache License, Version 2.0 (the "License");
     you may not use this file except in compliance with the License.
     You may obtain a copy of the License at

          http://www.apache.org/licenses/LICENSE-2.0

     Unless required by applicable law or agreed to in writing, software
     distributed under the License is distributed on an "AS IS" BASIS,
     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     See the License for the specific language governing permissions and
     limitations under the License.
-->
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical">

  <include
      layout="@layout/mtrl_date_picker_header"
      android:layout_width="match_parent"
      android:layout_height="wrap_content"
      android:layout_weight="0"/>

  <FrameLayout
      android:id="@+id/calendar_frame"
      android:layout_width="match_parent"
      android:layout_height="wrap_content"
      android:layout_weight="1"/>

  <include
      layout="@layout/mtrl_picker_actions"
      android:layout_width="match_parent"
      android:layout_height="wrap_content"
      android:layout_weight="0"/>

</LinearLayout>
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    