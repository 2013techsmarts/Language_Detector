package org.smarttechie;

import java.util.List;

import com.detectlanguage.DetectLanguage;
import com.detectlanguage.Result;
import com.detectlanguage.errors.APIError;

public class LanguageDetector {

	/**
	 * @param args
	 * @throws APIError 
	 */
	public static void main(String[] args) throws APIError {
		DetectLanguage.apiKey = "[YOUR API KEY]";
		List<Result> results = DetectLanguage.detect("ಕನ್ನಡ ಲಿಪಿ");

		Result result = results.get(0);

		System.out.println("Language: " + result.language);
		System.out.println("Is reliable: " + result.reliable);
		System.out.println("Confidence: " + result.confidence);
	}

}
