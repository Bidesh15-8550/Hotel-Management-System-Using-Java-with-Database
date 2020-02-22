/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author bides
 */
@Entity
@Table(name = "sign_up", catalog = "hotelm", schema = "")
@NamedQueries({
    @NamedQuery(name = "SignUp.findAll", query = "SELECT s FROM SignUp s")
    , @NamedQuery(name = "SignUp.findById", query = "SELECT s FROM SignUp s WHERE s.id = :id")
    , @NamedQuery(name = "SignUp.findByName", query = "SELECT s FROM SignUp s WHERE s.name = :name")
    , @NamedQuery(name = "SignUp.findByPhone", query = "SELECT s FROM SignUp s WHERE s.phone = :phone")
    , @NamedQuery(name = "SignUp.findByEmail", query = "SELECT s FROM SignUp s WHERE s.email = :email")
    , @NamedQuery(name = "SignUp.findByAddress", query = "SELECT s FROM SignUp s WHERE s.address = :address")
    , @NamedQuery(name = "SignUp.findByGender", query = "SELECT s FROM SignUp s WHERE s.gender = :gender")
    , @NamedQuery(name = "SignUp.findByCheckin", query = "SELECT s FROM SignUp s WHERE s.checkin = :checkin")
    , @NamedQuery(name = "SignUp.findByCheckout", query = "SELECT s FROM SignUp s WHERE s.checkout = :checkout")
    , @NamedQuery(name = "SignUp.findByRoomtype1", query = "SELECT s FROM SignUp s WHERE s.roomtype1 = :roomtype1")
    , @NamedQuery(name = "SignUp.findByRoomtype2", query = "SELECT s FROM SignUp s WHERE s.roomtype2 = :roomtype2")
    , @NamedQuery(name = "SignUp.findByPayment", query = "SELECT s FROM SignUp s WHERE s.payment = :payment")
    , @NamedQuery(name = "SignUp.findByCardnumber", query = "SELECT s FROM SignUp s WHERE s.cardnumber = :cardnumber")})
public class SignUp implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @Basic(optional = false)
    @Column(name = "Name")
    private String name;
    @Basic(optional = false)
    @Column(name = "Phone")
    private String phone;
    @Basic(optional = false)
    @Column(name = "Email")
    private String email;
    @Basic(optional = false)
    @Column(name = "Address")
    private String address;
    @Basic(optional = false)
    @Column(name = "Gender")
    private String gender;
    @Basic(optional = false)
    @Column(name = "Check_in")
    private String checkin;
    @Basic(optional = false)
    @Column(name = "Check_out")
    private String checkout;
    @Basic(optional = false)
    @Column(name = "Room_type1")
    private String roomtype1;
    @Basic(optional = false)
    @Column(name = "Room_type2")
    private String roomtype2;
    @Basic(optional = false)
    @Column(name = "Payment")
    private String payment;
    @Basic(optional = false)
    @Column(name = "Card_number")
    private String cardnumber;

    public SignUp() {
    }

    public SignUp(String id) {
        this.id = id;
    }

    public SignUp(String id, String name, String phone, String email, String address, String gender, String checkin, String checkout, String roomtype1, String roomtype2, String payment, String cardnumber) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.gender = gender;
        this.checkin = checkin;
        this.checkout = checkout;
        this.roomtype1 = roomtype1;
        this.roomtype2 = roomtype2;
        this.payment = payment;
        this.cardnumber = cardnumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        String oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        String oldPhone = this.phone;
        this.phone = phone;
        changeSupport.firePropertyChange("phone", oldPhone, phone);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        String oldAddress = this.address;
        this.address = address;
        changeSupport.firePropertyChange("address", oldAddress, address);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        String oldGender = this.gender;
        this.gender = gender;
        changeSupport.firePropertyChange("gender", oldGender, gender);
    }

    public String getCheckin() {
        return checkin;
    }

    public void setCheckin(String checkin) {
        String oldCheckin = this.checkin;
        this.checkin = checkin;
        changeSupport.firePropertyChange("checkin", oldCheckin, checkin);
    }

    public String getCheckout() {
        return checkout;
    }

    public void setCheckout(String checkout) {
        String oldCheckout = this.checkout;
        this.checkout = checkout;
        changeSupport.firePropertyChange("checkout", oldCheckout, checkout);
    }

    public String getRoomtype1() {
        return roomtype1;
    }

    public void setRoomtype1(String roomtype1) {
        String oldRoomtype1 = this.roomtype1;
        this.roomtype1 = roomtype1;
        changeSupport.firePropertyChange("roomtype1", oldRoomtype1, roomtype1);
    }

    public String getRoomtype2() {
        return roomtype2;
    }

    public void setRoomtype2(String roomtype2) {
        String oldRoomtype2 = this.roomtype2;
        this.roomtype2 = roomtype2;
        changeSupport.firePropertyChange("roomtype2", oldRoomtype2, roomtype2);
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        String oldPayment = this.payment;
        this.payment = payment;
        changeSupport.firePropertyChange("payment", oldPayment, payment);
    }

    public String getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(String cardnumber) {
        String oldCardnumber = this.cardnumber;
        this.cardnumber = cardnumber;
        changeSupport.firePropertyChange("cardnumber", oldCardnumber, cardnumber);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SignUp)) {
            return false;
        }
        SignUp other = (SignUp) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "hotel.SignUp[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
