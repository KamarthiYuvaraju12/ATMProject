package test;
public class CheckPinNo
{
	boolean k = false;
	
	boolean verify(int pinNo)
	
	{
		
		switch(pinNo)
		{
		case 1234 :k = true;
		break;
		case 5678 :k = true;
		break;
		case 1122 :k = true;
		break;
		
		}
	return k;
		}
	}

	
