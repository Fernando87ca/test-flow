/*
 * Copyright (c) 2020 Razeware LLC
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * Notwithstanding the foregoing, you may not use, copy, modify, merge, publish,
 * distribute, sublicense, create a derivative work, and/or sell copies of the
 * Software in any work that is designed, intended, or marketed for pedagogical or
 * instructional purposes related to programming, coding, application development,
 * or information technology.  Permission for such use, copying, modification,
 * merger, publication, distribution, sublicensing, creation of derivative works,
 * or sale is expressly withheld.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.raywenderlich.android.data.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Transaction
import com.raywenderlich.android.data.db.entities.DbForecast
import com.raywenderlich.android.data.db.entities.DbLocationDetails

@Dao
interface ForecastDao {

  @Transaction
  suspend fun updateLocationDetails(locationDetails: DbLocationDetails) {
    clearLocationDetails()
    insertLocationDetails(locationDetails)
  }

  @Insert
  suspend fun insertLocationDetails(locationDetails: DbLocationDetails)

  @Transaction
  suspend fun updateForecasts(forecasts: List<DbForecast>) {
    clearForecasts()
    insertAllForecast(forecasts)
  }

  @Insert
  suspend fun insertAllForecast(forecasts: List<DbForecast>)

  @Query("DELETE FROM location_details_table")
  suspend fun clearLocationDetails()

  @Query("DELETE FROM forecasts_table")
  suspend fun clearForecasts()

  @Query("SELECT * FROM location_details_table")
  suspend fun getLocationDetails(): DbLocationDetails?
}
