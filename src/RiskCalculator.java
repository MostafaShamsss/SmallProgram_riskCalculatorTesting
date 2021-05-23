public class RiskCalculator
{
    public String calculateRisk(int impact, int likelihood) throws IllegalArgumentException
    {

        int riskLevel;  String riskLevel_s="";

        if (impact<0 || impact>4 || likelihood<0 || likelihood>4){

            throw new IllegalArgumentException();}

        riskLevel=(impact*impact)+(likelihood*(likelihood));

        if (riskLevel>18) {

            riskLevel_s="High";}

        else if (riskLevel>8){

            riskLevel_s="Medium";}

        else if (riskLevel>0){

            riskLevel_s="Small";}

        else{

            riskLevel_s="Zero";}



        return riskLevel_s;

    }
}
