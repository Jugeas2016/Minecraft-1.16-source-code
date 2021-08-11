/*    */ import com.google.common.collect.Lists;
/*    */ import com.mojang.authlib.GameProfile;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import java.util.Collection;
/*    */ import java.util.List;
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
/*    */ public class b
/*    */   implements dm.a
/*    */ {
/*    */   private final fc a;
/*    */   
/*    */   public b(fc ☃) {
/* 71 */     this.a = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public Collection<GameProfile> getNames(db ☃) throws CommandSyntaxException {
/* 76 */     List<aah> list = this.a.d(☃);
/* 77 */     if (list.isEmpty()) {
/* 78 */       throw dk.e.create();
/*    */     }
/* 80 */     List<GameProfile> list1 = Lists.newArrayList();
/* 81 */     for (aah aah : list) {
/* 82 */       list1.add(aah.eA());
/*    */     }
/* 84 */     return list1;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dm$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */