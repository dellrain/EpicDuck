import java.awt.*;
import java.awt.image.BandCombineOp;

public class Duck {
    public void draw1stFrame(Graphics g, int background_width, int background_height) {

        g.setColor(Color.WHITE);
        g.fillRect(0, 0, background_width, background_height);

        g.setColor(new Color(252, 234, 60));
        g.fillRect(265, 144, 111, 240);
        g.setColor(new Color(252, 234, 60));
        g.fillRect(376, 192, 16, 160);
        g.setColor(new Color(252, 234, 60));
        g.fillRect(249, 176, 16, 208);
        g.setColor(new Color(252, 234, 60));
        g.fillRect(185, 256, 64, 128);
        g.setColor(new Color(252, 234, 60));
        g.fillRect(169, 288, 16, 80);
        g.setColor(new Color(252, 234, 60));
        g.fillRect(153, 304, 16, 64);
        g.setColor(new Color(252, 234, 60));
        g.fillRect(121, 288, 32, 64);
        //////////////////////Orange///////////////////////
        g.setColor(new Color(252, 190, 4));
        g.fillRect(120, 304, 48, 16);
        g.setColor(new Color(252, 190, 4));
        g.fillRect(120, 320, 32, 16);
        g.setColor(new Color(252, 190, 4));
        g.fillRect(248, 304, 16, 16);
        g.setColor(new Color(252, 190, 4));
        g.fillRect(280, 272, 32, 16);

        g.setColor(new Color(252, 190, 4));
        g.fillRect(249, 176, 16, 16);
        g.setColor(new Color(252, 190, 4));
        g.fillRect(265, 160, 16, 16);
        g.setColor(new Color(252, 190, 4));
        g.fillRect(297, 144, 48, 16);

        g.setColor(new Color(252, 190, 4));
        g.fillRect(313, 240, 16, 16);
        g.setColor(new Color(252, 190, 4));
        g.fillRect(329, 256, 63, 112);
        g.setColor(new Color(252, 190, 4));
        g.fillRect(313, 288, 16, 80);
        g.setColor(new Color(252, 190, 4));
        g.fillRect(297, 320, 16, 64);
        g.setColor(new Color(252, 190, 4));
        g.fillRect(281, 336, 16, 48);
        g.setColor(new Color(252, 190, 4));
        g.fillRect(249, 352, 32, 32);
        g.setColor(new Color(252, 190, 4));
        g.fillRect(233, 368, 16, 16);
        //////////////////////////////////////////////////////
        //////////////////////Тёмно-оранжевый1/////////////////
        g.setColor(new Color(252, 150, 4));
        g.fillRect(120, 304, 16, 16);
        g.setColor(new Color(252, 150, 4));
        g.fillRect(232, 320, 16, 16);

        g.setColor(new Color(252, 150, 4));
        g.fillRect(264, 272, 16, 16);
        g.setColor(new Color(252, 150, 4));
        g.fillRect(248, 256, 16, 16);

        g.setColor(new Color(252, 150, 4));
        g.fillRect(281, 144, 16, 16);

        g.setColor(new Color(252, 150, 4));
        g.fillRect(360, 256, 16, 16);
        g.setColor(new Color(252, 150, 4));
        g.fillRect(376, 240, 16, 16);
        g.setColor(new Color(252, 150, 4));
        g.fillRect(376, 288, 16, 16);
        g.setColor(new Color(252, 150, 4));
        g.fillRect(360, 352, 16, 16);
        g.setColor(new Color(252, 150, 4));
        g.fillRect(312, 368, 32, 16);
        //////////////////////////////////////////////////////
        /////////////////Клюв/////////////////////////////////
        g.setColor(new Color(228, 56, 52));
        g.fillRect(329, 224, 32, 16);
        g.setColor(new Color(196, 38, 40));
        g.fillRect(329, 240, 48, 16);
        //////////////////////////////////////////////////////
        //////////////////////Крыло1/////////////////
        g.setColor(Color.BLACK);
        g.fillRect(168, 320, 32, 16);
        g.setColor(Color.BLACK);
        g.fillRect(200, 336, 32, 16);
        //////////////////////////////////////////////////////

        ///////////////////////////////border1
        g.setColor(Color.BLACK);
        g.fillRect(281, 128, 80, 16);
        g.setColor(Color.BLACK);
        g.fillRect(361, 144, 16, 16);
        g.setColor(Color.BLACK);
        g.fillRect(376, 160, 16, 32);
        g.setColor(Color.BLACK);
        g.fillRect(392, 192, 16, 64);
        g.setColor(Color.BLACK);
        g.fillRect(376, 256, 16, 32);
        g.setColor(Color.BLACK);
        g.fillRect(392, 288, 16, 64);
        g.setColor(Color.BLACK);
        g.fillRect(376, 352, 16, 16);
        g.setColor(Color.BLACK);
        g.fillRect(344, 368, 32, 16);

        //слева
        g.setColor(Color.BLACK);
        g.fillRect(265, 144, 16, 16);
        g.setColor(Color.BLACK);
        g.fillRect(249, 160, 16, 16);
        g.setColor(Color.BLACK);
        g.fillRect(233, 176, 16, 64);
        g.setColor(Color.BLACK);
        g.fillRect(201, 240, 48, 16);
        g.setColor(Color.BLACK);
        g.fillRect(185, 256, 16, 16);
        g.setColor(Color.BLACK);
        g.fillRect(169, 272, 16, 16);
        g.setColor(Color.BLACK);
        g.fillRect(121, 288, 48, 16);
        g.setColor(Color.BLACK);
        g.fillRect(105, 304, 16, 32);
        g.setColor(Color.BLACK);
        g.fillRect(121, 336, 16, 16);
        g.setColor(Color.BLACK);
        g.fillRect(137, 352, 16, 16);
        g.setColor(Color.BLACK);
        g.fillRect(153, 368, 48, 16);
        g.setColor(Color.BLACK);
        g.fillRect(185, 384, 48, 32);
        g.setColor(Color.BLACK);
        g.fillRect(233, 384, 64, 16);
        g.setColor(Color.BLACK);
        g.fillRect(297, 384, 48, 32);
        ////////////////////////////////////////////////
/////////////////////////////////////////////Очки1
        g.setColor(Color.BLACK);
        g.fillRect(249, 192, 16, 16);
        g.setColor(Color.BLACK);
        g.fillRect(265, 208, 16, 16);
        g.setColor(Color.BLACK);
        g.fillRect(281, 192, 48, 48);
        g.setColor(Color.BLACK);
        g.fillRect(329, 208, 32, 16);
        g.setColor(Color.BLACK);
        g.fillRect(361, 192, 47, 48);
        ///Блики///
        g.setColor(new Color(244, 242, 244));
        g.fillRect(281, 208, 16, 16);
        g.setColor(new Color(244, 242, 244));
        g.fillRect(297, 192, 16, 16);
        g.setColor(new Color(244, 242, 244));
        g.fillRect(361, 208, 16, 16);
        g.setColor(new Color(244, 242, 244));
        g.fillRect(377, 192, 16, 16);

    }

    public void draw2dFrame(Graphics g, int background_width, int background_height) {
        /////////////////////////////Жёлтый2///////////////////
        g.setColor(new Color(252,242,189));
        g.fillRect(0, 0, background_width, background_width);

        g.setColor(new Color(252, 234, 60));
        g.fillRect(265, 128, 111, 240);

        g.setColor(new Color(252, 234, 60));
        g.fillRect(376, 192, 16, 160);

        g.setColor(new Color(252, 234, 60));
        g.fillRect(249, 176, 16, 208);

        g.setColor(new Color(252, 234, 60));
        g.fillRect(185, 240, 64, 147);

        g.setColor(new Color(252, 234, 60));
        g.fillRect(169, 272, 16, 96);

        g.setColor(new Color(252, 234, 60));
        g.fillRect(153, 288, 16, 80);

        g.setColor(new Color(252, 234, 60));
        g.fillRect(121, 288, 32, 64);
        //////////////////////////////////////////////////////
//////////////////////Оранжевый2///////////////////////
        g.setColor(new Color(252, 190, 4));
        g.fillRect(120, 304, 33, 32);


        g.setColor(new Color(252, 190, 4));
        g.fillRect(201, 320, 16, 16);

        g.setColor(new Color(252, 190, 4));
        g.fillRect(248, 304, 16, 16);

        g.setColor(new Color(252, 190, 4));
        g.fillRect(280, 272, 16, 16);

        g.setColor(new Color(252, 190, 4));
        g.fillRect(249, 160, 16, 16);
        g.setColor(new Color(252, 190, 4));
        g.fillRect(265, 144, 16, 16);
        g.setColor(new Color(252, 190, 4));
        g.fillRect(297, 128, 48, 16);

        g.setColor(new Color(252, 190, 4));
        g.fillRect(313, 224, 16, 16);
        g.setColor(new Color(252, 190, 4));
        g.fillRect(329, 240, 63, 128);
        g.setColor(new Color(252, 190, 4));
        g.fillRect(313, 288, 16, 80);
        g.setColor(new Color(252, 190, 4));
        g.fillRect(297, 320, 16, 64);
        g.setColor(new Color(252, 190, 4));
        g.fillRect(281, 336, 16, 48);
        g.setColor(new Color(252, 190, 4));
        g.fillRect(249, 352, 32, 32);
        g.setColor(new Color(252, 190, 4));
        g.fillRect(233, 368, 16, 16);
        //////////////////////////////////////////////////////
        //////////////////////Тёмно-оранжевый2/////////////////
        g.setColor(new Color(252, 150, 4));
        g.fillRect(120, 304, 16, 16);

        g.setColor(new Color(252, 150, 4));
        g.fillRect(217, 320, 16, 16);
        g.setColor(new Color(252, 150, 4));
        g.fillRect(233, 304, 16, 16);

        g.setColor(new Color(252, 150, 4));
        g.fillRect(264, 272, 16, 16);
        g.setColor(new Color(252, 150, 4));
        g.fillRect(248, 256, 16, 16);
        g.setColor(new Color(252, 150, 4));
        g.fillRect(232, 240, 16, 16);

        g.setColor(new Color(252, 150, 4));
        g.fillRect(281, 128, 16, 16);

        g.setColor(new Color(252, 150, 4));
        g.fillRect(360, 240, 16, 16);
        g.setColor(new Color(252, 150, 4));
        g.fillRect(376, 224, 16, 16);
        g.setColor(new Color(252, 150, 4));
        g.fillRect(376, 272, 16, 32);
        g.setColor(new Color(252, 150, 4));
        g.fillRect(360, 352, 16, 16);
        g.setColor(new Color(252, 150, 4));
        g.fillRect(312, 368, 32, 16);
        //////////////////////////////////////////////////////
        /////////////////Клюв2/////////////////////////////////
        g.setColor(new Color(228, 56, 52));
        g.fillRect(329, 208, 32, 16);
        g.setColor(new Color(196, 38, 40));
        g.fillRect(329, 224, 48, 16);
        //////////////////////////////////////////////////////
        //////////////////////Крыло2/////////////////
        g.setColor(Color.BLACK);
        g.fillRect(153, 304, 16, 16);
        g.setColor(Color.BLACK);
        g.fillRect(169, 320, 16, 16);
        g.setColor(Color.BLACK);
        g.fillRect(185, 336, 48, 16);
        g.setColor(Color.BLACK);
        g.fillRect(233, 320, 16, 16);
        g.setColor(Color.BLACK);
        g.fillRect(249, 288, 16, 32);
        //////////////////////////////////////////////////////

        ///////////////////////////////border2
        g.setColor(Color.BLACK);
        g.fillRect(281, 112, 80, 16);
        g.setColor(Color.BLACK);
        g.fillRect(361, 128, 16, 16);
        g.setColor(Color.BLACK);
        g.fillRect(376, 144, 16, 32);
        g.setColor(Color.BLACK);
        g.fillRect(392, 176, 16, 64);
        g.setColor(Color.black);
        g.fillRect(376, 240, 16, 32);
        g.setColor(Color.BLACK);
        g.fillRect(392, 272, 16, 80);
        g.setColor(Color.BLACK);
        g.fillRect(376, 352, 16, 16);
        g.setColor(Color.BLACK);
        g.fillRect(344, 368, 32, 16);

        //слева
        g.setColor(Color.BLACK);
        g.fillRect(265, 128, 16, 16);
        g.setColor(Color.BLACK);
        g.fillRect(249, 144, 16, 16);
        g.setColor(Color.BLACK);
        g.fillRect(233, 160, 16, 64);
        g.setColor(Color.BLACK);
        g.fillRect(201, 224, 48, 16);
        g.setColor(Color.BLACK);
        g.fillRect(185, 240, 16, 16);
        g.setColor(Color.BLACK);
        g.fillRect(169, 256, 16, 16);
        g.setColor(Color.BLACK);
        g.fillRect(153, 272, 16, 16);
        g.setColor(Color.BLACK);
        g.fillRect(121, 288, 32, 16);
        g.setColor(Color.BLACK);
        g.fillRect(105, 304, 16, 32);
        g.setColor(Color.BLACK);
        g.fillRect(121, 336, 16, 16);
        g.setColor(Color.BLACK);
        g.fillRect(137, 352, 16, 16);
        g.setColor(Color.BLACK);
        g.fillRect(153, 368, 48, 16);
        g.setColor(Color.BLACK);
        g.fillRect(185, 384, 48, 32);
        g.setColor(Color.BLACK);
        g.fillRect(233, 384, 64, 16);
        g.setColor(Color.BLACK);
        g.fillRect(297, 384, 48, 32);
        ////////////////////////////////////////////////
/////////////////////////////////////////////Очки2
        g.setColor(Color.BLACK);
        g.fillRect(249, 176, 16, 16);
        g.setColor(Color.BLACK);
        g.fillRect(265, 192, 16, 16);
        g.setColor(Color.BLACK);
        g.fillRect(281, 176, 48, 48);
        g.setColor(Color.BLACK);
        g.fillRect(329, 192, 32, 16);
        g.setColor(Color.BLACK);
        g.fillRect(361, 176, 47, 48);
        ///Блики///
        g.setColor(new Color(244, 242, 244));
        g.fillRect(281, 192, 16, 16);
        g.setColor(new Color(244, 242, 244));
        g.fillRect(297, 176, 16, 16);
        g.setColor(new Color(244, 242, 244));
        g.fillRect(361, 192, 16, 16);
        g.setColor(new Color(244, 242, 244));
        g.fillRect(377, 176, 16, 16);
    }
///////////////////////////////////////////////////////////////////////////


    public void draw3dFrame(Graphics g, int background_width, int background_height) {
        /////////////////////////////Жёлтый3///////////////////
        g.setColor(new Color(243,214,182));
        g.fillRect(0, 0, background_width, background_width);

        g.setColor(new Color(252, 234, 60));
        g.fillRect(265, 144, 111, 240);

        g.setColor(new Color(252, 234, 60));
        g.fillRect(376, 192, 16, 160);

        g.setColor(new Color(252, 234, 60));
        g.fillRect(249, 176, 16, 208);

        g.setColor(new Color(252, 234, 60));
        g.fillRect(185, 256, 64, 128);

        g.setColor(new Color(252, 234, 60));
        g.fillRect(153, 256, 236, 112);

        g.setColor(new Color(252, 234, 60));
        g.fillRect(153, 304, 16, 64);

        g.setColor(new Color(252, 234, 60));
        g.fillRect(121, 288, 32, 64);
        //////////////////////////////////////////////////////
//////////////////////Оранжевый3///////////////////////
        g.setColor(new Color(252, 190, 4));
        g.fillRect(120, 304, 33, 16);
        g.setColor(new Color(252, 190, 4));
        g.fillRect(120, 320, 32, 16);

        g.setColor(new Color(252, 190, 4));
        g.fillRect(217, 304, 16, 16);
        g.setColor(new Color(252, 190, 4));
        g.fillRect(233, 288, 16, 16);

        g.setColor(new Color(252, 190, 4));
        g.fillRect(280, 272, 32, 16);

        g.setColor(new Color(252, 190, 4));
        g.fillRect(249, 176, 16, 16);
        g.setColor(new Color(252, 190, 4));
        g.fillRect(265, 160, 16, 16);
        g.setColor(new Color(252, 190, 4));
        g.fillRect(297, 144, 48, 16);

        g.setColor(new Color(252, 190, 4));
        g.fillRect(313, 240, 16, 16);
        g.setColor(new Color(252, 190, 4));
        g.fillRect(329, 256, 63, 112);
        g.setColor(new Color(252, 190, 4));
        g.fillRect(313, 288, 16, 80);
        g.setColor(new Color(252, 190, 4));
        g.fillRect(297, 320, 16, 64);
        g.setColor(new Color(252, 190, 4));
        g.fillRect(281, 336, 16, 48);
        g.setColor(new Color(252, 190, 4));
        g.fillRect(249, 352, 32, 32);
        g.setColor(new Color(252, 190, 4));
        g.fillRect(233, 368, 16, 16);
        //////////////////////////////////////////////////////
//////////////////////Тёмно-оранжевый3/////////////////
        g.setColor(new Color(252, 150, 4));
        g.fillRect(264, 272, 16, 16);
        g.setColor(new Color(252, 150, 4));
        g.fillRect(248, 256, 16, 16);

        g.setColor(new Color(252, 150, 4));
        g.fillRect(281, 144, 16, 16);

        g.setColor(new Color(252, 150, 4));
        g.fillRect(360, 256, 16, 16);
        g.setColor(new Color(252, 150, 4));
        g.fillRect(376, 240, 16, 16);
        g.setColor(new Color(252, 150, 4));
        g.fillRect(376, 288, 16, 16);
        g.setColor(new Color(252, 150, 4));
        g.fillRect(360, 352, 16, 16);
        g.setColor(new Color(252, 150, 4));
        g.fillRect(312, 368, 32, 16);
        //////////////////////////////////////////////////////
        /////////////////Клюв/////////////////////////////////
        g.setColor(new Color(228, 56, 52));
        g.fillRect(329, 224, 32, 16);
        g.setColor(new Color(196, 38, 40));
        g.fillRect(329, 240, 48, 16);
        //////////////////////////////////////////////////////
        //////////////////////Крыло3/////////////////
        g.setColor(Color.BLACK);
        g.fillRect(153, 304, 16, 16);
        g.setColor(Color.BLACK);
        g.fillRect(169, 320, 64, 16);
        g.setColor(Color.BLACK);
        g.fillRect(233, 304, 16, 16);
        g.setColor(Color.BLACK);
        g.fillRect(249, 272, 16, 32);
        g.setColor(Color.BLACK);
        g.fillRect(233, 256, 16, 16);
        //////////////////////////////////////////////////////

        ///////////////////////////////border3
        g.setColor(Color.BLACK);
        g.fillRect(281, 128, 80, 16);
        g.setColor(Color.BLACK);
        g.fillRect(361, 144, 16, 16);
        g.setColor(Color.BLACK);
        g.fillRect(376, 160, 16, 32);
        g.setColor(Color.BLACK);
        g.fillRect(392, 192, 16, 64);
        g.setColor(Color.BLACK);
        g.fillRect(376, 256, 16, 32);
        g.setColor(Color.BLACK);
        g.fillRect(392, 288, 16, 64);
        g.setColor(Color.BLACK);
        g.fillRect(376, 352, 16, 16);
        g.setColor(Color.BLACK);
        g.fillRect(344, 368, 32, 16);

        //слева
        g.setColor(Color.BLACK);
        g.fillRect(265, 144, 16, 16);
        g.setColor(Color.BLACK);
        g.fillRect(249, 160, 16, 16);
        g.setColor(Color.BLACK);
        g.fillRect(233, 176, 16, 64);

        g.setColor(Color.BLACK);
        g.fillRect(153, 240, 96, 16);
        g.setColor(Color.BLACK);
        g.fillRect(137, 256, 16, 32);
        g.setColor(Color.BLACK);
        g.fillRect(121, 288, 32, 16);
        g.setColor(Color.BLACK);
        g.fillRect(105, 304, 16, 32);
        g.setColor(Color.BLACK);
        g.fillRect(121, 336, 16, 16);
        g.setColor(Color.BLACK);
        g.fillRect(137, 352, 16, 16);
        g.setColor(Color.BLACK);
        g.fillRect(153, 368, 48, 16);
        g.setColor(Color.BLACK);
        g.fillRect(185, 384, 48, 32);
        g.setColor(Color.BLACK);
        g.fillRect(233, 384, 64, 16);
        g.setColor(Color.BLACK);
        g.fillRect(297, 384, 48, 32);
        ////////////////////////////////////////////////
/////////////////////////////////////////////Очки3
        g.setColor(Color.BLACK);
        g.fillRect(249, 192, 16, 16);
        g.setColor(Color.BLACK);
        g.fillRect(265, 208, 16, 16);
        g.setColor(Color.BLACK);
        g.fillRect(281, 192, 48, 48);
        g.setColor(Color.BLACK);
        g.fillRect(329, 208, 32, 16);
        g.setColor(Color.BLACK);
        g.fillRect(361, 192, 47, 48);
        ///Блики///
        g.setColor(new Color(244, 242, 244));
        g.fillRect(281, 208, 16, 16);
        g.setColor(new Color(244, 242, 244));
        g.fillRect(297, 192, 16, 16);
        g.setColor(new Color(244, 242, 244));
        g.fillRect(361, 208, 16, 16);
        g.setColor(new Color(244, 242, 244));
        g.fillRect(377, 192, 16, 16);
///////////////////////////////////////////////////////////////////////////

    }

    public void draw4thFrame(Graphics g, int background_width, int background_height) {

        g.setColor(new Color(252,242,188));
        g.fillRect(0, 0, background_width, background_width);

        g.setColor(new Color(252, 234, 60));
        g.fillRect(265, 160, 111, 208);

        g.setColor(new Color(252, 234, 60));
        g.fillRect(376, 192, 16, 160);

        g.setColor(new Color(252, 234, 60));
        g.fillRect(249, 176, 16, 208);

        g.setColor(new Color(252, 234, 60));
        g.fillRect(185, 240, 64, 147);

        g.setColor(new Color(252, 234, 60));
        g.fillRect(169, 272, 16, 96);

        g.setColor(new Color(252, 234, 60));
        g.fillRect(153, 288, 16, 80);

        g.setColor(new Color(252, 234, 60));
        g.fillRect(121, 288, 32, 64);
        //////////////////////////////////////////////////////
//////////////////////Оранжевый4///////////////////////
        g.setColor(new Color(252, 190, 4));
        g.fillRect(120, 304, 33, 32);


        g.setColor(new Color(252, 190, 4));
        g.fillRect(201, 320, 16, 16);

        g.setColor(new Color(252, 190, 4));
        g.fillRect(248, 304, 16, 16);

        g.setColor(new Color(252, 190, 4));
        g.fillRect(280, 288, 33, 16);

        g.setColor(new Color(252, 190, 4));
        g.fillRect(249, 192, 16, 16);
        g.setColor(new Color(252, 190, 4));
        g.fillRect(265, 176, 16, 16);
        g.setColor(new Color(252, 190, 4));
        g.fillRect(297, 160, 48, 16);

        g.setColor(new Color(252, 190, 4));
        g.fillRect(313, 256, 16, 16);

        g.setColor(new Color(252, 190, 4));
        g.fillRect(329, 240, 63, 128);
        g.setColor(new Color(252, 190, 4));
        g.fillRect(313, 304, 16, 80);
        g.setColor(new Color(252, 190, 4));
        g.fillRect(297, 320, 16, 64);
        g.setColor(new Color(252, 190, 4));
        g.fillRect(281, 336, 16, 48);
        g.setColor(new Color(252, 190, 4));
        g.fillRect(249, 352, 32, 32);
        g.setColor(new Color(252, 190, 4));
        g.fillRect(233, 368, 16, 16);
        //////////////////////////////////////////////////////
        //////////////////////Тёмно-оранжевый4/////////////////
        g.setColor(new Color(252, 150, 4));
        g.fillRect(120, 304, 16, 16);

        g.setColor(new Color(252, 150, 4));
        g.fillRect(217, 320, 16, 16);
        g.setColor(new Color(252, 150, 4));
        g.fillRect(233, 304, 16, 16);

        g.setColor(new Color(252, 150, 4));
        g.fillRect(264, 272, 16, 16);
        g.setColor(new Color(252, 150, 4));
        g.fillRect(248, 256, 16, 16);
        g.setColor(new Color(252, 150, 4));
        g.fillRect(232, 240, 16, 16);

        g.setColor(new Color(252, 150, 4));
        g.fillRect(281, 160, 16, 16);


        g.setColor(new Color(252, 150, 4));
        g.fillRect(376, 256, 16, 16);
        g.setColor(new Color(252, 150, 4));
        g.fillRect(360, 352, 16, 16);
        g.setColor(new Color(252, 150, 4));
        g.fillRect(360, 272, 16, 16);
        g.setColor(new Color(252, 150, 4));
        g.fillRect(312, 368, 32, 16);
        //////////////////////////////////////////////////////
        /////////////////Клюв4/////////////////////////////////
        g.setColor(new Color(228, 56, 52));
        g.fillRect(329, 240, 32, 16);
        g.setColor(new Color(196, 38, 40));
        g.fillRect(329, 256, 48, 16);
        //////////////////////////////////////////////////////
        //////////////////////Крыло4/////////////////
        g.setColor(Color.BLACK);
        g.fillRect(153, 304, 16, 16);
        g.setColor(Color.BLACK);
        g.fillRect(169, 320, 16, 16);
        g.setColor(Color.BLACK);
        g.fillRect(185, 336, 48, 16);
        g.setColor(Color.BLACK);
        g.fillRect(233, 320, 16, 16);
        g.setColor(Color.BLACK);
        g.fillRect(249, 288, 16, 32);
        //////////////////////////////////////////////////////

        ///////////////////////////////border4
        g.setColor(Color.BLACK);
        g.fillRect(281, 144, 80, 16);
        g.setColor(Color.BLACK);
        g.fillRect(361, 160, 16, 16);
        g.setColor(Color.BLACK);
        g.fillRect(376, 176, 16, 32);
        g.setColor(Color.black);
        g.fillRect(392, 208, 16, 64);
        g.setColor(Color.BLACK);
        g.fillRect(376, 272, 16, 32);
        g.setColor(Color.BLACK);
        g.fillRect(392, 304, 16, 48);
        g.setColor(Color.BLACK);
        g.fillRect(376, 352, 16, 16);
        g.setColor(Color.BLACK);
        g.fillRect(344, 368, 32, 16);

        //слева
        g.setColor(Color.BLACK);
        g.fillRect(265, 160, 16, 16);
        g.setColor(Color.BLACK);
        g.fillRect(249, 176, 16, 16);
        g.setColor(Color.BLACK);
        g.fillRect(233, 192, 16, 48);
        g.setColor(Color.BLACK);
        g.fillRect(201, 224, 48, 16);
        g.setColor(Color.BLACK);
        g.fillRect(185, 240, 16, 16);
        g.setColor(Color.BLACK);
        g.fillRect(169, 256, 16, 16);
        g.setColor(Color.BLACK);
        g.fillRect(153, 272, 16, 16);
        g.setColor(Color.BLACK);
        g.fillRect(121, 288, 32, 16);
        g.setColor(Color.BLACK);
        g.fillRect(105, 304, 16, 32);
        g.setColor(Color.BLACK);
        g.fillRect(121, 336, 16, 16);
        g.setColor(Color.BLACK);
        g.fillRect(137, 352, 16, 16);
        g.setColor(Color.BLACK);
        g.fillRect(153, 368, 48, 16);
        g.setColor(Color.BLACK);
        g.fillRect(185, 384, 48, 32);
        g.setColor(Color.BLACK);
        g.fillRect(233, 384, 64, 16);
        g.setColor(Color.BLACK);
        g.fillRect(297, 384, 48, 32);
        ////////////////////////////////////////////////
/////////////////////////////////////////////Очки4
        g.setColor(Color.BLACK);
        g.fillRect(249, 208, 16, 16);
        g.setColor(Color.BLACK);
        g.fillRect(265, 224, 16, 16);
        g.setColor(Color.BLACK);
        g.fillRect(281, 208, 48, 48);
        g.setColor(Color.BLACK);
        g.fillRect(329, 224, 32, 16);
        g.setColor(Color.BLACK);
        g.fillRect(361, 208, 47, 48);
        ///Блики///
        g.setColor(new Color(244, 242, 244));
        g.fillRect(281, 224, 16, 16);
        g.setColor(new Color(244, 242, 244));
        g.fillRect(297, 208, 16, 16);
        g.setColor(new Color(244, 242, 244));
        g.fillRect(361, 224, 16, 16);
        g.setColor(new Color(244, 242, 244));
        g.fillRect(377, 208, 16, 16);
///////////////////////////////////////////////////////////////////////////

    }
}
