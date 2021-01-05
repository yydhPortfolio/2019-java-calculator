package views;

//import calculation.Calculate;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class MainController {

	@FXML
	private TextField results;

//	@FXML
//	public Button btn1;
//
//	@FXML
//	public Button btn2;
//
//	@FXML
//	public Button btn3;
//
//	@FXML
//	public Button btn4;
//
//	@FXML
//	public Button btn5;
//
//	@FXML
//	public Button btn6;
//
//	@FXML
//	public Button btn7;
//
//	@FXML
//	public Button btn8;
//
//	@FXML
//	public Button btn9;
//
//	@FXML
//	public Button btn0;
//
//	@FXML
//	public Button btnAC;
//
//	@FXML
//	public Button btnNe;
//
//	@FXML
//	public Button btnPer;
//
//	@FXML
//	public Button btnSla;
//
//	@FXML
//	public Button btnX;
//
//	@FXML
//	public Button btnMin;
//
//	@FXML
//	public Button btnPlu;
//
//	@FXML
//	public Button btnEqu;
//
//	@FXML
//	public Button btnPo;

//	private boolean ne = false;

//	private boolean per = false;

	private boolean sla = false;

	private boolean x = false;

	private boolean min = false;

	private boolean plu = false;

	private boolean po = false;

	private boolean equ = true;

	// 전체 결과
	double sum = 0;

	// 현재 고른 숫자
	double progress = 0;

	String showProgress = "";

	String showSum = "";

	int cnt = 0;

	int cnt1 = 0;

//	int btnCnt = 0;

//	private Calculate calculate;

	@FXML
	private void initialize() {
//		calculate.calculate();
	}

	@FXML
	private void btnAc() {

		// AC 작동

		sum = 0;
		progress = 0;

		results.setText("0.0");

		sla = false;
		x = false;
		min = false;
		plu = false;
		po = false;
		equ = true;

		cnt1 = 0;
	}

	@FXML
	private void btnSla() {
		sla = true;
		x = false;
		min = false;
		plu = false;
		po = false;
		cnt1++;
	}

	@FXML
	private void btnX() {
		sla = false;
		x = true;
		min = false;
		plu = false;
		po = false;
		equ = false;
		progress = 0;
		cnt1++;
	}

	@FXML
	private void btnMin() {
		sla = false;
		x = false;
		min = true;
		plu = false;
		po = false;
		equ = false;
		progress = 0;
		cnt1++;
	}

	@FXML
	private void btnPlu() {
		sla = false;
		x = false;
		min = false;
		plu = true;
		po = false;
		equ = false;
		progress = 0;
		cnt1++;
	}

	@FXML
	private void btnPo() {
		sla = false;
		x = false;
		min = false;
		plu = false;
		po = true;
		equ = false;
		progress = 0;
		cnt1++;
	}

	@FXML
	private void btn1() {
		progress = (progress * 10) + 1;
		showProgress = Double.toString(progress);
		results.setText(showProgress);
		if (cnt1 == 0 && equ) {
			sum = progress;
			System.out.println(sum);
		}
	}

	@FXML
	private void btn2() {
		progress = (progress * 10) + 2;
		showProgress = Double.toString(progress);
		results.setText(showProgress);
		if (cnt1 == 0 && equ) {
			sum = progress;
		}
	}

	@FXML
	private void btn3() {
		progress = (progress * 10) + 3;
		showProgress = Double.toString(progress);
		results.setText(showProgress);
		if (cnt1 == 0 && equ) {
			sum = progress;
		}
	}

	@FXML
	private void btn4() {
		progress = (progress * 10) + 4;
		showProgress = Double.toString(progress);
		results.setText(showProgress);
		if (cnt1 == 0 && equ) {
			sum = progress;
		}
	}

	@FXML
	private void btn5() {
		progress = (progress * 10) + 5;
		showProgress = Double.toString(progress);
		results.setText(showProgress);
		if (cnt1 == 0 && equ) {
			sum = progress;
		}
	}

	@FXML
	private void btn6() {
		progress = (progress * 10) + 6;
		showProgress = Double.toString(progress);
		System.out.println(showProgress);
		results.setText(showProgress);
		if (cnt1 == 0 && equ) {
			sum = progress;
		}
	}

	@FXML
	private void btn7() {
		progress = (progress * 10) + 7;
		showProgress = Double.toString(progress);
		results.setText(showProgress);
		if (cnt1 == 0 && equ) {
			sum = progress;
		}
	}

	@FXML
	private void btn8() {
		progress = (progress * 10) + 8;
		showProgress = Double.toString(progress);
		results.setText(showProgress);
		if (cnt1 == 0) {
			sum = progress;
		}
	}

	@FXML
	private void btn9() {
		progress = (progress * 10) + 9;
		showProgress = Double.toString(progress);
		results.setText(showProgress);
		if (cnt1 == 0) {
			sum = progress;
		}
	}

	@FXML
	private void btn0() {
		progress = (progress * 10);
		showProgress = Double.toString(progress);
		results.setText(showProgress);
		if (cnt1 == 0 && equ) {
			sum = progress;
		}
	}

	@FXML
	private void btnEqu() {
		if (sla) {
			sum = sum / progress;
			showSum = Double.toString(sum);
			results.setText(showSum);
			progress = 0;
			System.out.println(sum);
		}

		if (x) {
			sum = sum * progress;
			showSum = Double.toString(sum);
			results.setText(showSum);
			progress = 0;
			System.out.println(sum);
		}

		if (min) {
			sum = sum - progress;
			showSum = Double.toString(sum);
			results.setText(showSum);
			progress = 0;
			System.out.println(sum);
		}

		if (plu) {
			sum = sum + progress;
			showSum = Double.toString(sum);
			results.setText(showSum);
			progress = 0;
			System.out.println(sum);
		}

//		if (po) {
//			sum = sum / progress;
//			showSum = Double.toString(sum);
//			results.setText(showSum);
//			progress = 0;
//		}
	}

}
