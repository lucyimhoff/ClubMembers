import java.util.ArrayList;
public class Main{
    public static void main(String[] args){
        ClubMembers test = new ClubMembers();
        String[] members = {"XIA PEISU", "ELLIS, CLARENCE", "VON AHN, LUIS"};
        test.addMembers(members, 2025);
        System.out.println(test.getMemberList());
    }
}