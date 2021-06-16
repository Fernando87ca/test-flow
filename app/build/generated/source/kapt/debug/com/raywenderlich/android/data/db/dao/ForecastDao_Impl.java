package com.raywenderlich.android.data.db.dao;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomDatabaseKt;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.raywenderlich.android.data.db.entities.DbForecast;
import com.raywenderlich.android.data.db.entities.DbLocationDetails;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ForecastDao_Impl implements ForecastDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<DbLocationDetails> __insertionAdapterOfDbLocationDetails;

  private final EntityInsertionAdapter<DbForecast> __insertionAdapterOfDbForecast;

  private final SharedSQLiteStatement __preparedStmtOfClearLocationDetails;

  private final SharedSQLiteStatement __preparedStmtOfClearForecasts;

  public ForecastDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfDbLocationDetails = new EntityInsertionAdapter<DbLocationDetails>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `location_details_table` (`time`,`sunrise`,`sunset`,`title`,`id`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, DbLocationDetails value) {
        if (value.getTime() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getTime());
        }
        if (value.getSunrise() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getSunrise());
        }
        if (value.getSunset() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getSunset());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getTitle());
        }
        stmt.bindLong(5, value.getId());
      }
    };
    this.__insertionAdapterOfDbForecast = new EntityInsertionAdapter<DbForecast>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `forecasts_table` (`id`,`state`,`windDirection`,`date`,`minTemp`,`maxTemp`,`temp`,`windSpeed`,`pressure`,`humidity`,`visibility`,`predictability`,`weatherStateAbbreviation`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, DbForecast value) {
        stmt.bindLong(1, value.getId());
        if (value.getState() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getState());
        }
        if (value.getWindDirection() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getWindDirection());
        }
        if (value.getDate() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDate());
        }
        stmt.bindDouble(5, value.getMinTemp());
        stmt.bindDouble(6, value.getMaxTemp());
        stmt.bindDouble(7, value.getTemp());
        stmt.bindDouble(8, value.getWindSpeed());
        stmt.bindDouble(9, value.getPressure());
        stmt.bindDouble(10, value.getHumidity());
        stmt.bindDouble(11, value.getVisibility());
        stmt.bindLong(12, value.getPredictability());
        if (value.getWeatherStateAbbreviation() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getWeatherStateAbbreviation());
        }
      }
    };
    this.__preparedStmtOfClearLocationDetails = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM location_details_table";
        return _query;
      }
    };
    this.__preparedStmtOfClearForecasts = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM forecasts_table";
        return _query;
      }
    };
  }

  @Override
  public Object insertLocationDetails(final DbLocationDetails locationDetails,
      final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfDbLocationDetails.insert(locationDetails);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object insertAllForecast(final List<DbForecast> forecasts,
      final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfDbForecast.insert(forecasts);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object updateLocationDetails(final DbLocationDetails locationDetails,
      final Continuation<? super Unit> p1) {
    return RoomDatabaseKt.withTransaction(__db, new Function1<Continuation<? super Unit>, Object>() {
      @Override
      public Object invoke(Continuation<? super Unit> __cont) {
        return ForecastDao.DefaultImpls.updateLocationDetails(ForecastDao_Impl.this, locationDetails, __cont);
      }
    }, p1);
  }

  @Override
  public Object updateForecasts(final List<DbForecast> forecasts,
      final Continuation<? super Unit> p1) {
    return RoomDatabaseKt.withTransaction(__db, new Function1<Continuation<? super Unit>, Object>() {
      @Override
      public Object invoke(Continuation<? super Unit> __cont) {
        return ForecastDao.DefaultImpls.updateForecasts(ForecastDao_Impl.this, forecasts, __cont);
      }
    }, p1);
  }

  @Override
  public Object clearLocationDetails(final Continuation<? super Unit> p0) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfClearLocationDetails.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfClearLocationDetails.release(_stmt);
        }
      }
    }, p0);
  }

  @Override
  public Object clearForecasts(final Continuation<? super Unit> p0) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfClearForecasts.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfClearForecasts.release(_stmt);
        }
      }
    }, p0);
  }

  @Override
  public Object getLocationDetails(final Continuation<? super DbLocationDetails> p0) {
    final String _sql = "SELECT * FROM location_details_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.execute(__db, false, new Callable<DbLocationDetails>() {
      @Override
      public DbLocationDetails call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfTime = CursorUtil.getColumnIndexOrThrow(_cursor, "time");
          final int _cursorIndexOfSunrise = CursorUtil.getColumnIndexOrThrow(_cursor, "sunrise");
          final int _cursorIndexOfSunset = CursorUtil.getColumnIndexOrThrow(_cursor, "sunset");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final DbLocationDetails _result;
          if(_cursor.moveToFirst()) {
            final String _tmpTime;
            _tmpTime = _cursor.getString(_cursorIndexOfTime);
            final String _tmpSunrise;
            _tmpSunrise = _cursor.getString(_cursorIndexOfSunrise);
            final String _tmpSunset;
            _tmpSunset = _cursor.getString(_cursorIndexOfSunset);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            _result = new DbLocationDetails(_tmpTime,_tmpSunrise,_tmpSunset,_tmpTitle,_tmpId);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p0);
  }
}
