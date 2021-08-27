var json = {
	title: "Create Your Survey",
	showProgressBar: "top",
	pages: [{
			questions: [
			]
		},
		{
			questions: [
			]
		}
	]
};
var editorOptions = {showEmbededSurveyTab: false,
                    showTestSurveyTab : false,
  showTranslationTab: true,                  showJSONEditorTab : false,}; //see examples below
var survey = new SurveyEditor.SurveyEditor("surveyEditorContainer", editorOptions);
//set function on save callback
survey.text = JSON.stringify(json);;
survey.saveSurveyFunc = saveMySurvey;

function saveMySurvey(){
 console.log(survey.text);
 alert('saved :D');
  
}