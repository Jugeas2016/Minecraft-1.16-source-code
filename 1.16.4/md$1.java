/*    */ import com.google.common.collect.Maps;
/*    */ import java.io.DataInput;
/*    */ import java.io.IOException;
/*    */ import java.util.Map;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ final class null
/*    */   implements mv<md>
/*    */ {
/*    */   public md a(DataInput ☃, int i, mm mm1) throws IOException {
/* 72 */     mm1.a(384L);
/*    */     
/* 74 */     if (i > 512) {
/* 75 */       throw new RuntimeException("Tried to read NBT tag with too high complexity, depth > 512");
/*    */     }
/* 77 */     Map<String, mt> map = Maps.newHashMap();
/*    */     byte b;
/* 79 */     while ((b = md.a(☃, mm1)) != 0) {
/* 80 */       String str = md.b(☃, mm1);
/* 81 */       mm1.a((224 + 16 * str.length()));
/*    */       
/* 83 */       mt mt = md.a(mw.a(b), str, ☃, i + 1, mm1);
/* 84 */       if (map.put(str, mt) != null) {
/* 85 */         mm1.a(288L);
/*    */       }
/*    */     } 
/* 88 */     return new md(map);
/*    */   }
/*    */ 
/*    */   
/*    */   public String a() {
/* 93 */     return "COMPOUND";
/*    */   }
/*    */ 
/*    */   
/*    */   public String b() {
/* 98 */     return "TAG_Compound";
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\md$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */