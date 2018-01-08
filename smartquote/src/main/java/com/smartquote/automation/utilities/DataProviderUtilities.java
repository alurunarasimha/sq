package com.smartquote.automation.utilities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.testng.annotations.DataProvider;

import com.org.uiautomation.ConfigReader;
import com.smartquote.automation.excelutilities.SQExcelUtilities;
import com.smartquote.automation.quotedata.DealCreationData;
import com.smartquote.automation.quotedata.QuoteTestdataSource;

public class DataProviderUtilities {

	private static String dataKeyFor_SQ_SmartQuote_DealCreate = "SQ_Deal_Creation";
	private static String datakeyfor_SQ_SmartQuote_data ="STAND";

	@DataProvider(name = "dataForSQExternal",parallel=true)
	public static Object[][] getDataForSQExternal() {

		String filePath = ConfigReader.getValuewithCustomPropertyName(dataKeyFor_SQ_SmartQuote_DealCreate);

		String dataProviderIndexPropValue = ConfigReader
				.getValuewithCustomPropertyName("DATA_PROVIDER_FILTER_BY_INDEX");

		Set<Integer> indexValues = new HashSet<Integer>();

if (dataProviderIndexPropValue != null && dataProviderIndexPropValue.length() > 0) {

			String[] indexValuesAsStrings = dataProviderIndexPropValue.split(",");
			for (String eachIndex : indexValuesAsStrings) {

				try {
					indexValues.add(Integer.parseInt(eachIndex));
				} catch (NumberFormatException e) {
					throw new RuntimeException(
							"Please pass indexes by ',' [comma] -- Eg: DATA_PROVIDER_FILTER_BY_INDEX=1,3");
				}
			}
		}

	/*	List<DealCreationData> dealsCreationData = ExcelUtilities.readExcelDealCreationDataToPojo(filePath,
				dataKeyFor_SQ_SmartQuote_DealCreate);*/
		
		List<QuoteTestdataSource> dealsCreationData = SQExcelUtilities.readExcelQuoteTestdataMapToPojo(filePath, 
				dataKeyFor_SQ_SmartQuote_DealCreate);

		List<Object> data = new ArrayList<Object>();

		int counter = 0;

		for (QuoteTestdataSource eachRowData : dealsCreationData) {

			if (indexValues.size() > 0) {
				if (indexValues.contains(counter + 1)) {
					data.add(eachRowData);
					// data[counter][0] = eachRowData;
				}
			} else {
				// data[counter][0] = eachRowData;
				data.add(eachRowData);

			}

			counter++;

		}

		Object[][] returnData = new Object[data.size()][1];
		int returnArrayCounter = 0;

		for (Object eachDataRow : data) {
			returnData[returnArrayCounter][0] = eachDataRow;
			returnArrayCounter++;
		}

		return returnData;
	}
	
}
