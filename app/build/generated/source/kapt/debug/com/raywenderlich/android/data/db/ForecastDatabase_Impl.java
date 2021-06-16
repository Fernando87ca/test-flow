package com.raywenderlich.android.data.db;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.raywenderlich.android.data.db.dao.ForecastDao;
import com.raywenderlich.android.data.db.dao.ForecastDao_Impl;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ForecastDatabase_Impl extends ForecastDatabase {
  private volatile ForecastDao _forecastDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `location_details_table` (`time` TEXT NOT NULL, `sunrise` TEXT NOT NULL, `sunset` TEXT NOT NULL, `title` TEXT NOT NULL, `id` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `forecasts_table` (`id` INTEGER NOT NULL, `state` TEXT NOT NULL, `windDirection` TEXT NOT NULL, `date` TEXT NOT NULL, `minTemp` REAL NOT NULL, `maxTemp` REAL NOT NULL, `temp` REAL NOT NULL, `windSpeed` REAL NOT NULL, `pressure` REAL NOT NULL, `humidity` REAL NOT NULL, `visibility` REAL NOT NULL, `predictability` INTEGER NOT NULL, `weatherStateAbbreviation` TEXT NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'dd1378961ac87c633c23cf16533bb9c1')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `location_details_table`");
        _db.execSQL("DROP TABLE IF EXISTS `forecasts_table`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsLocationDetailsTable = new HashMap<String, TableInfo.Column>(5);
        _columnsLocationDetailsTable.put("time", new TableInfo.Column("time", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLocationDetailsTable.put("sunrise", new TableInfo.Column("sunrise", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLocationDetailsTable.put("sunset", new TableInfo.Column("sunset", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLocationDetailsTable.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLocationDetailsTable.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysLocationDetailsTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesLocationDetailsTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoLocationDetailsTable = new TableInfo("location_details_table", _columnsLocationDetailsTable, _foreignKeysLocationDetailsTable, _indicesLocationDetailsTable);
        final TableInfo _existingLocationDetailsTable = TableInfo.read(_db, "location_details_table");
        if (! _infoLocationDetailsTable.equals(_existingLocationDetailsTable)) {
          return new RoomOpenHelper.ValidationResult(false, "location_details_table(com.raywenderlich.android.data.db.entities.DbLocationDetails).\n"
                  + " Expected:\n" + _infoLocationDetailsTable + "\n"
                  + " Found:\n" + _existingLocationDetailsTable);
        }
        final HashMap<String, TableInfo.Column> _columnsForecastsTable = new HashMap<String, TableInfo.Column>(13);
        _columnsForecastsTable.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsForecastsTable.put("state", new TableInfo.Column("state", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsForecastsTable.put("windDirection", new TableInfo.Column("windDirection", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsForecastsTable.put("date", new TableInfo.Column("date", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsForecastsTable.put("minTemp", new TableInfo.Column("minTemp", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsForecastsTable.put("maxTemp", new TableInfo.Column("maxTemp", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsForecastsTable.put("temp", new TableInfo.Column("temp", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsForecastsTable.put("windSpeed", new TableInfo.Column("windSpeed", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsForecastsTable.put("pressure", new TableInfo.Column("pressure", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsForecastsTable.put("humidity", new TableInfo.Column("humidity", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsForecastsTable.put("visibility", new TableInfo.Column("visibility", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsForecastsTable.put("predictability", new TableInfo.Column("predictability", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsForecastsTable.put("weatherStateAbbreviation", new TableInfo.Column("weatherStateAbbreviation", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysForecastsTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesForecastsTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoForecastsTable = new TableInfo("forecasts_table", _columnsForecastsTable, _foreignKeysForecastsTable, _indicesForecastsTable);
        final TableInfo _existingForecastsTable = TableInfo.read(_db, "forecasts_table");
        if (! _infoForecastsTable.equals(_existingForecastsTable)) {
          return new RoomOpenHelper.ValidationResult(false, "forecasts_table(com.raywenderlich.android.data.db.entities.DbForecast).\n"
                  + " Expected:\n" + _infoForecastsTable + "\n"
                  + " Found:\n" + _existingForecastsTable);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "dd1378961ac87c633c23cf16533bb9c1", "874e09b3178e68070c46e7f7daa53900");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "location_details_table","forecasts_table");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `location_details_table`");
      _db.execSQL("DELETE FROM `forecasts_table`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public ForecastDao forecastDao() {
    if (_forecastDao != null) {
      return _forecastDao;
    } else {
      synchronized(this) {
        if(_forecastDao == null) {
          _forecastDao = new ForecastDao_Impl(this);
        }
        return _forecastDao;
      }
    }
  }
}
