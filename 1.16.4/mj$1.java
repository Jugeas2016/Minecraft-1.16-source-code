/*    */ import com.google.common.collect.Lists;
/*    */ import java.io.DataInput;
/*    */ import java.io.IOException;
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
/*    */ final class null
/*    */   implements mv<mj>
/*    */ {
/*    */   public mj a(DataInput ☃, int i, mm mm1) throws IOException {
/* 35 */     mm1.a(296L);
/*    */     
/* 37 */     if (i > 512) {
/* 38 */       throw new RuntimeException("Tried to read NBT tag with too high complexity, depth > 512");
/*    */     }
/* 40 */     byte b = ☃.readByte();
/* 41 */     int j = ☃.readInt();
/* 42 */     if (b == 0 && j > 0) {
/* 43 */       throw new RuntimeException("Missing type on ListTag");
/*    */     }
/* 45 */     mm1.a(32L * j);
/* 46 */     mv<?> mv1 = mw.a(b);
/* 47 */     List<mt> list = Lists.newArrayListWithCapacity(j);
/* 48 */     for (int k = 0; k < j; k++) {
/* 49 */       list.add((mt)mv1.b(☃, i + 1, mm1));
/*    */     }
/* 51 */     return new mj(list, b, null);
/*    */   }
/*    */ 
/*    */   
/*    */   public String a() {
/* 56 */     return "LIST";
/*    */   }
/*    */ 
/*    */   
/*    */   public String b() {
/* 61 */     return "TAG_List";
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\mj$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */