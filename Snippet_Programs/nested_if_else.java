if ("forward".equals(cmd)) 
{
    if (slide >= numSlides) 
        beep.play();
    else 
        slide++;
}
else 
{
    if (slide <= 1) 
        beep.play();
    else 
        slide--;
    }
