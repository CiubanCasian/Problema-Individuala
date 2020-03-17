package loose.oose.fis.documents;

import java.util.Arrays;

public class NewClass extends Document {

	public NewClass(String[] continut) {
        super(continut);
    }

	@Override
	public String[] analizeaza() {
         
		String cuv[];
		int i=0;

		for (String cuvant : continut) {
                	{
				cuv[i] = cuvant.continut+"-"+i;
				i++;
			}
		return cuv;
    }

    @Override
    public String toString() {
        return "NewClass: " + super.toString();
    }


}