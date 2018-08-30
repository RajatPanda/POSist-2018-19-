/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posist.code;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author 15103362
 */
class Data
{
    String fdata;
    private int oid;
    private float val;
    private String name;
    private int hcode;

    public Data(int oid, float val, String name) {
        this.oid = oid;
        this.val = val;
        this.name = name;
        String s = String.valueOf(oid)+String.valueOf(val)+name;
        this.hcode = s.hashCode();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.oid;
        hash = 97 * hash + Float.floatToIntBits(this.val);
        hash = 97 * hash + Objects.hashCode(this.name);
        return hash;
    }

}
public class Node {
    private Date timestamp;
    private Data data;
    private Integer nodenum;
    private String nodeID;
    private String refNodeID;
    private String ChildrefNodeID;
    private String genesisNodeID;
    private int hashval;

    public Node(Date timestamp, Data data, Integer nodenum, String nodeID, String refNodeID, String ChildrefNodeID, String genesisNodeID) {
        this.timestamp = timestamp;
        this.data = data;
        this.nodenum = nodenum;
        this.nodeID = nodeID;
        this.refNodeID = refNodeID;
        this.ChildrefNodeID = ChildrefNodeID;
        this.genesisNodeID = genesisNodeID;
        this.hashval = data.hashCode();
    }
    
}
