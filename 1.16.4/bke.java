/*    */ import java.util.List;
/*    */ import javax.annotation.Nullable;
/*    */ import org.apache.commons.lang3.Validate;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bke
/*    */   extends bnd
/*    */ {
/*    */   public bke(buo ☃, buo buo1, blx.a a1) {
/* 23 */     super(☃, buo1, a1);
/*    */     
/* 25 */     Validate.isInstanceOf(btm.class, ☃);
/* 26 */     Validate.isInstanceOf(btm.class, buo1);
/*    */   }
/*    */   
/*    */   public static void a(bmb ☃, List<nr> list) {
/* 30 */     md md = ☃.b("BlockEntityTag");
/* 31 */     if (md == null || !md.e("Patterns")) {
/*    */       return;
/*    */     }
/*    */     
/* 35 */     mj mj = md.d("Patterns", 10);
/* 36 */     for (int i = 0; i < mj.size() && i < 6; i++) {
/* 37 */       md md1 = mj.a(i);
/* 38 */       bkx bkx = bkx.a(md1.h("Color"));
/* 39 */       ccb ccb = ccb.a(md1.l("Pattern"));
/*    */       
/* 41 */       if (ccb != null) {
/* 42 */         list.add((new of("block.minecraft.banner." + ccb.a() + '.' + bkx.c())).a(k.h));
/*    */       }
/*    */     } 
/*    */   }
/*    */   
/*    */   public bkx b() {
/* 48 */     return ((btm)e()).b();
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(bmb ☃, @Nullable brx brx1, List<nr> list, bnl bnl1) {
/* 53 */     a(☃, list);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bke.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */