/*    */ import java.io.File;
/*    */ import java.io.FileInputStream;
/*    */ import java.io.FileNotFoundException;
/*    */ import java.io.InputStream;
/*    */ import java.util.Collection;
/*    */ import java.util.function.Predicate;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class eki
/*    */   extends abm
/*    */ {
/*    */   private final ekg d;
/*    */   
/*    */   public eki(ekg ☃) {
/* 19 */     super(new String[] { "minecraft", "realms" });
/* 20 */     this.d = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   protected InputStream c(abk ☃, vk vk1) {
/* 26 */     if (☃ == abk.a) {
/* 27 */       File file = this.d.a(vk1);
/* 28 */       if (file != null && file.exists()) {
/*    */         try {
/* 30 */           return new FileInputStream(file);
/* 31 */         } catch (FileNotFoundException fileNotFoundException) {}
/*    */       }
/*    */     } 
/*    */     
/* 35 */     return super.c(☃, vk1);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b(abk ☃, vk vk1) {
/* 40 */     if (☃ == abk.a) {
/* 41 */       File file = this.d.a(vk1);
/* 42 */       if (file != null && file.exists()) {
/* 43 */         return true;
/*    */       }
/*    */     } 
/* 46 */     return super.b(☃, vk1);
/*    */   }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   protected InputStream a(String ☃) {
/* 52 */     File file = this.d.a(☃);
/* 53 */     if (file != null && file.exists()) {
/*    */       try {
/* 55 */         return new FileInputStream(file);
/* 56 */       } catch (FileNotFoundException fileNotFoundException) {}
/*    */     }
/*    */     
/* 59 */     return super.a(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public Collection<vk> a(abk ☃, String str1, String str2, int i, Predicate<String> predicate) {
/* 64 */     Collection<vk> collection = super.a(☃, str1, str2, i, predicate);
/* 65 */     collection.addAll(this.d.a(str2, str1, i, predicate));
/* 66 */     return collection;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eki.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */