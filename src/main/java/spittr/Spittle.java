package spittr;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import java.util.Date;

/**
 * Created by hhy on 2017/5/19.
 */
public class Spittle {
    private final Long id;
    private final String message;
    private final Date time;
    private Double latitude;
    private Double longitude;
    public Spittle(String message,Date time,Double longitude,Double latitude){
        this.id=null;
        this.message=message;
        this.time=time;
        this.longitude=longitude;
        this.latitude=latitude;
    }
    public Spittle(String message,Date time){
        this(message,time,null,null);
    }
    public long getId(){
        return id;
    }
    public String getMessage(){
        return message;
    }
    public Date getTime(){
        return time;
    }
    public Double getLongitude(){
        return longitude;
    }
    public Double getLatitude(){
        return latitude;
    }
    @Override
    public boolean equals(Object that){
        String[] s={"id","time"};
        return EqualsBuilder.reflectionEquals(this,that,s);
    }
    @Override
    public int hashCode(){
        String[] s={"id","time"};
        return HashCodeBuilder.reflectionHashCode(this,s);
    }
}
