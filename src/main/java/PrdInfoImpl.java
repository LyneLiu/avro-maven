import com.lyne.proto.PrdIdentity;
import com.lyne.proto.PrdInfo;
import com.lyne.proto.PrdInfoType;

/**
 * Created by nn_liu on 2017/6/19.
 */
public class PrdInfoImpl implements PrdInfo {

    // in this simple example just return details of the message
    public PrdInfoType queryPrdInfo(PrdIdentity prdIdentity) {
        System.out.println("Sending message");
        PrdInfoType prdInfoType = new PrdInfoType();
        if (prdIdentity.getId() == 1){
            prdInfoType.setId(1);
            prdInfoType.setType("adult");
            prdInfoType.setPrice(20.1);
        }else {
            prdInfoType.setId(2);
            prdInfoType.setType("child");
            prdInfoType.setPrice(10.1);
        }
        return prdInfoType;
    }
}
