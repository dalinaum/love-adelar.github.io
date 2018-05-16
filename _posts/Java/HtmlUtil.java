/* 
 * 추상화 수준이 다양하다.
 * 코드도 너무 길다.
 * 두 겹으로 중첩된 if문은 이상한 플래그를 확인한다.
 * 이상한 문자열을 사용한다.
 * 이상한 함수를 호출한다.
 */

public static String testableHtml(
	PageData pagedata,
	boolean includeSuiteSetup
  ) throws Exception {
	WikiPage wikiPage = pageData.getWikiPage();
	StringBuffer buffer = new StringBuffer();
	if (pageData.hasAttribute("Test")) {
		if (includeSuiteSetup) {
			WikiPage suiteSetup = 
			PageCrawlerImpl.getInheritedPage(
				SuiteResponder.SUITE_SETUP_NAME, wikiPage
		);
		if (suiteSetup != null) {
			WikiPagePath pagePath = 
				suiteSetup.getPageCrawler().getFullPath(suiteSetup);
			String pagePathName = PathParser.render(pagePath);
			buffer.append("!include -setup .")
				  .append(pagePathName)
				  .append("\n");
		}
	  }
	  WikiPage setup = 
	  	PageCrawlerImpl.getInheritedPage("SetUp", wikiPage);
	  if (setup != null) {
	  	WikiPagePath setupPath = 
	  		wikiPage.getPageCrawler().getFullPath(setup);
	  	String setupPathName = PathParser.render(setupPath);
	  	buffer.append("!include - setup .")
	  		  .append(setupPathName)
	  		  .append("\n");
	  }
	}
	buffer.append(pageData.getContent());
	if (pageData.hasAttribute("Test")) {
		WikiPage teardown = 
			PageCrawlerImpl.getInheritedPage("Teardown", wikiPage);
		if (teardown != null) {
			WikiPagePath tearDownPath = 
				wikiPage.getPageCrawler().getFullPath(teardown);
			String tearDownPathName = PathParser.render(tearDownPath);
			buffer.append("\n")
				  .append("!include -teardown .")
				  .append("\n");
		}
		if (includeSuiteSetup) {
			wikiPage suiteTeardown = 
			PageCrawlerImpl.getInheritedPage(
				SuiteResponder.SUITE_TEARDOWN_NAME,
				WikiPage
			);
			if (suiteTeardown != null) {
				WikiPagePath pagePath = 
					suiteTeardown.getPageCrawler().getFullPath (suiteTeardown);
				String pagePathName = PathParser.render(pagePath);
				buffer.append("!include -teardown .")
					  .append(pagePathName)
					  .append("\n");
			}
		}
	}
	pageData.setContent(buffer.toString());
	return pageData.getHtml();
}