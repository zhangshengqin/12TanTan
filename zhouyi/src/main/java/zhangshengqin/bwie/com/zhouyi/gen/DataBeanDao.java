package zhangshengqin.bwie.com.zhouyi.gen;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import zhangshengqin.bwie.com.zhouyi.bean.DataBean;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "DATA_BEAN".
*/
public class DataBeanDao extends AbstractDao<DataBean, String> {

    public static final String TABLENAME = "DATA_BEAN";

    /**
     * Properties of entity DataBean.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property News_id = new Property(0, String.class, "news_id", true, "NEWS_ID");
        public final static Property News_title = new Property(1, String.class, "news_title", false, "NEWS_TITLE");
        public final static Property News_summary = new Property(2, String.class, "news_summary", false, "NEWS_SUMMARY");
        public final static Property Pic_url = new Property(3, String.class, "pic_url", false, "PIC_URL");
    }


    public DataBeanDao(DaoConfig config) {
        super(config);
    }
    
    public DataBeanDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"DATA_BEAN\" (" + //
                "\"NEWS_ID\" TEXT PRIMARY KEY NOT NULL ," + // 0: news_id
                "\"NEWS_TITLE\" TEXT," + // 1: news_title
                "\"NEWS_SUMMARY\" TEXT," + // 2: news_summary
                "\"PIC_URL\" TEXT);"); // 3: pic_url
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"DATA_BEAN\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, DataBean entity) {
        stmt.clearBindings();
 
        String news_id = entity.getNews_id();
        if (news_id != null) {
            stmt.bindString(1, news_id);
        }
 
        String news_title = entity.getNews_title();
        if (news_title != null) {
            stmt.bindString(2, news_title);
        }
 
        String news_summary = entity.getNews_summary();
        if (news_summary != null) {
            stmt.bindString(3, news_summary);
        }
 
        String pic_url = entity.getPic_url();
        if (pic_url != null) {
            stmt.bindString(4, pic_url);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, DataBean entity) {
        stmt.clearBindings();
 
        String news_id = entity.getNews_id();
        if (news_id != null) {
            stmt.bindString(1, news_id);
        }
 
        String news_title = entity.getNews_title();
        if (news_title != null) {
            stmt.bindString(2, news_title);
        }
 
        String news_summary = entity.getNews_summary();
        if (news_summary != null) {
            stmt.bindString(3, news_summary);
        }
 
        String pic_url = entity.getPic_url();
        if (pic_url != null) {
            stmt.bindString(4, pic_url);
        }
    }

    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0);
    }    

    @Override
    public DataBean readEntity(Cursor cursor, int offset) {
        DataBean entity = new DataBean( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // news_id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // news_title
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // news_summary
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3) // pic_url
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, DataBean entity, int offset) {
        entity.setNews_id(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setNews_title(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setNews_summary(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setPic_url(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
     }
    
    @Override
    protected final String updateKeyAfterInsert(DataBean entity, long rowId) {
        return entity.getNews_id();
    }
    
    @Override
    public String getKey(DataBean entity) {
        if(entity != null) {
            return entity.getNews_id();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(DataBean entity) {
        return entity.getNews_id() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
