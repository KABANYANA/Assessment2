// **Ancestral Stories:** In many African cultures, 
// the art of storytelling is passed
// down from generation to generation. 
// Imagine you're creating an application that
// records these oral stories and translates 
// them into different languages. The
// stories vary by length, moral lessons, 
// and the age group they are intended for.
// Think about how you would model `Story`, `StoryTeller`, and `Translator`
// objects, and how inheritance might come into play if there 
// are different types of
// stories or storytellers.

class Stories{
    constructor(length,moralLesson,ageGroup){
        this.length=length
        this.moralLesson=moralLesson
        this.ageGroup=ageGroup
    function addStory(){
            var newStory=[]
            newStory.push(this.length,this.moralLesson,this.ageGroup)
            return newStory
    }
    addStory()

    }
   
}
class StoryTeller{
    constructor(name,story){
        this.name=name
        this.story=story
        function recordStory(){
            var recordedStory=[]
            recordedStory.push(this.storyName,this.yourName)
            return recordedStory
        }
        recordStory()
    }


}
class Translator{
    constructor(transname,language,storyName){
        this.name=transname
        this.languages=language
        this.storyName=storyName

        function translateStory(){
            var translatedStories=[]
            translatedStories.push(this.transname,this.language,this.storyName)
            return translatedStories
        }
        translateStory()
    }
}

var story1= new Stories(23,"behavoirs","20-25")
console.log(story1.addStory())

var storyteller1=new StoryTeller("Joyeuse","baby Shark")
console.log(storyteller1.recordStory())

var translator1= new Translator("JOY","Kinyarwanda","Babyshark")
console.log(translator1.translateStory())

