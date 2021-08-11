/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class egi
/*    */   extends efw<baq, dvj<baq>>
/*    */ {
/*  9 */   private static final vk a = new vk("textures/entity/rabbit/brown.png");
/* 10 */   private static final vk g = new vk("textures/entity/rabbit/white.png");
/* 11 */   private static final vk h = new vk("textures/entity/rabbit/black.png");
/* 12 */   private static final vk i = new vk("textures/entity/rabbit/gold.png");
/* 13 */   private static final vk j = new vk("textures/entity/rabbit/salt.png");
/* 14 */   private static final vk k = new vk("textures/entity/rabbit/white_splotched.png");
/* 15 */   private static final vk l = new vk("textures/entity/rabbit/toast.png");
/* 16 */   private static final vk m = new vk("textures/entity/rabbit/caerbannog.png");
/*    */   
/*    */   public egi(eet ☃) {
/* 19 */     super(☃, new dvj<>(), 0.3F);
/*    */   }
/*    */ 
/*    */   
/*    */   public vk a(baq ☃) {
/* 24 */     String str = k.a(☃.R().getString());
/* 25 */     if (str != null && "Toast".equals(str)) {
/* 26 */       return l;
/*    */     }
/*    */     
/* 29 */     switch (☃.eN())
/*    */     
/*    */     { default:
/* 32 */         return a;
/*    */       case 1:
/* 34 */         return g;
/*    */       case 2:
/* 36 */         return h;
/*    */       case 4:
/* 38 */         return i;
/*    */       case 5:
/* 40 */         return j;
/*    */       case 3:
/* 42 */         return k;
/*    */       case 99:
/* 44 */         break; }  return m;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\egi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */