

        package com.example.masterdex.models;

        import androidx.room.ColumnInfo;
        import androidx.room.Entity;
        import androidx.room.PrimaryKey;
        import androidx.room.TypeConverter;
        import androidx.room.TypeConverters;

        import com.google.gson.annotations.SerializedName;

        import java.io.Serializable;
        import java.util.Comparator;

        @Entity(tableName = "pokemons")
public class Pokemon implements Serializable {

    // aki nao tem segredo

    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "number")
    private int number;

    @ColumnInfo(name = "url")
    private String url;

    @ColumnInfo(name = "name")
    private String name;
//
//    private TipoCamada1 types;
//
//    public TipoCamada1 getTypes() {
//        return types;
//    }
//
//    public void setTypes(TipoCamada1 types) {
//        this.types = types;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        String[] urlSplit = url.split("/");
        return Integer.parseInt(urlSplit[urlSplit.length - 1]);
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Comparator<Pokemon> alfabeticamente = new Comparator<Pokemon>() {
        @Override
        public int compare(Pokemon one, Pokemon two) {
            return one.getName().compareTo(two.getName()) ;
        }
    };

}


