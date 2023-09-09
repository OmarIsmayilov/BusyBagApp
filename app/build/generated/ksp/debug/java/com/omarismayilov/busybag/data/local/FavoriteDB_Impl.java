package com.omarismayilov.busybag.data.local;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.omarismayilov.busybag.data.local.cart.CartDAO;
import com.omarismayilov.busybag.data.local.cart.CartDAO_Impl;
import com.omarismayilov.busybag.data.local.favorite.FavoriteDAO;
import com.omarismayilov.busybag.data.local.favorite.FavoriteDAO_Impl;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class FavoriteDB_Impl extends FavoriteDB {
  private volatile FavoriteDAO _favoriteDAO;

  private volatile CartDAO _cartDAO;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `favorite_product` (`id` INTEGER NOT NULL, `title` TEXT NOT NULL, `rating` INTEGER NOT NULL, `price` INTEGER NOT NULL, `originalPrice` REAL NOT NULL, `discount` INTEGER NOT NULL, `image` TEXT NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `cart_product` (`id` INTEGER NOT NULL, `title` TEXT NOT NULL, `price` INTEGER NOT NULL, `image` TEXT NOT NULL, `quantity` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '223311a1d4d71c7791c70c3037de9346')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `favorite_product`");
        _db.execSQL("DROP TABLE IF EXISTS `cart_product`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      public void onCreate(SupportSQLiteDatabase _db) {
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
      public RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsFavoriteProduct = new HashMap<String, TableInfo.Column>(7);
        _columnsFavoriteProduct.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavoriteProduct.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavoriteProduct.put("rating", new TableInfo.Column("rating", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavoriteProduct.put("price", new TableInfo.Column("price", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavoriteProduct.put("originalPrice", new TableInfo.Column("originalPrice", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavoriteProduct.put("discount", new TableInfo.Column("discount", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavoriteProduct.put("image", new TableInfo.Column("image", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysFavoriteProduct = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesFavoriteProduct = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoFavoriteProduct = new TableInfo("favorite_product", _columnsFavoriteProduct, _foreignKeysFavoriteProduct, _indicesFavoriteProduct);
        final TableInfo _existingFavoriteProduct = TableInfo.read(_db, "favorite_product");
        if (! _infoFavoriteProduct.equals(_existingFavoriteProduct)) {
          return new RoomOpenHelper.ValidationResult(false, "favorite_product(com.omarismayilov.busybag.data.local.favorite.FavoriteDTO).\n"
                  + " Expected:\n" + _infoFavoriteProduct + "\n"
                  + " Found:\n" + _existingFavoriteProduct);
        }
        final HashMap<String, TableInfo.Column> _columnsCartProduct = new HashMap<String, TableInfo.Column>(5);
        _columnsCartProduct.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCartProduct.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCartProduct.put("price", new TableInfo.Column("price", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCartProduct.put("image", new TableInfo.Column("image", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCartProduct.put("quantity", new TableInfo.Column("quantity", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCartProduct = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCartProduct = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCartProduct = new TableInfo("cart_product", _columnsCartProduct, _foreignKeysCartProduct, _indicesCartProduct);
        final TableInfo _existingCartProduct = TableInfo.read(_db, "cart_product");
        if (! _infoCartProduct.equals(_existingCartProduct)) {
          return new RoomOpenHelper.ValidationResult(false, "cart_product(com.omarismayilov.busybag.data.local.cart.CartDTO).\n"
                  + " Expected:\n" + _infoCartProduct + "\n"
                  + " Found:\n" + _existingCartProduct);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "223311a1d4d71c7791c70c3037de9346", "fcfab16ba532656b2994f30822fdc06d");
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
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "favorite_product","cart_product");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `favorite_product`");
      _db.execSQL("DELETE FROM `cart_product`");
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
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(FavoriteDAO.class, FavoriteDAO_Impl.getRequiredConverters());
    _typeConvertersMap.put(CartDAO.class, CartDAO_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public FavoriteDAO getFavDao() {
    if (_favoriteDAO != null) {
      return _favoriteDAO;
    } else {
      synchronized(this) {
        if(_favoriteDAO == null) {
          _favoriteDAO = new FavoriteDAO_Impl(this);
        }
        return _favoriteDAO;
      }
    }
  }

  @Override
  public CartDAO getCartDao() {
    if (_cartDAO != null) {
      return _cartDAO;
    } else {
      synchronized(this) {
        if(_cartDAO == null) {
          _cartDAO = new CartDAO_Impl(this);
        }
        return _cartDAO;
      }
    }
  }
}
