import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class whiteSpaceCharacterTest {
    @Test
    void singleAtBeginning(){
        var replaceBlank = new whiteSpaceCharacter();
        assertEquals(" Eid Mubarak", replaceBlank.replaceDubleBlank(" Eid Mubarak"),"singleAtBeginning failed!");
    }

    @Test
    void singleAtEnd(){
        var replaceBlank = new whiteSpaceCharacter();
        assertEquals("Eid Mubarak ", replaceBlank.replaceDubleBlank("Eid Mubarak "),"singleAtEnd failed!");
    }

    @Test
    void singleBlankWithNoChange(){
        var replaceBlank = new whiteSpaceCharacter();
        assertEquals("Eid Mubarak", replaceBlank.replaceDubleBlank("Eid Mubarak"),"singleBlankWithNoChange failed!");
    }

    @Test
    void singleDiff(){
        var replaceBlank = new whiteSpaceCharacter();
        assertEquals(" Eid Mubarak ", replaceBlank.replaceDubleBlank(" Eid Mubarak "),"replaceSeqDiff failed!");
    }

    @Test
    void seqOfJustBlank(){
        var replaceBlank = new whiteSpaceCharacter();
        assertEquals(" ", replaceBlank.replaceDubleBlank("   "),"seqOfJustBlank failed!");
    }

    @Test
    void emptyString(){
        var replaceBlank = new whiteSpaceCharacter();
        assertEquals("", replaceBlank.replaceDubleBlank(""),"emptyString failed!");
    }

    @Test
    void replaceSeqAtBeginning(){
        var replaceBlank = new whiteSpaceCharacter();
        assertEquals(" Eid Mubarak", replaceBlank.replaceDubleBlank("    Eid Mubarak"));
    }

    @Test
    void replaceSeqAtEnd(){
        var replaceBlank = new whiteSpaceCharacter();
        assertEquals("Eid Mubarak ", replaceBlank.replaceDubleBlank("Eid Mubarak   "));
    }

    @Test
    void replaceSeqDiff(){
        var replaceBlank = new whiteSpaceCharacter();
        assertEquals(" Eid Mubarak ", replaceBlank.replaceDubleBlank("  Eid    Mubarak   "));
    }
}