/*    */ import com.google.common.collect.Lists;
/*    */ import com.mojang.brigadier.context.StringRange;
/*    */ import com.mojang.brigadier.suggestion.Suggestion;
/*    */ import com.mojang.brigadier.suggestion.Suggestions;
/*    */ import java.io.IOException;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class pc
/*    */   implements oj<om>
/*    */ {
/*    */   private int a;
/*    */   private Suggestions b;
/*    */   
/*    */   public pc() {}
/*    */   
/*    */   public pc(int ☃, Suggestions suggestions) {
/* 23 */     this.a = ☃;
/* 24 */     this.b = suggestions;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nf ☃) throws IOException {
/* 29 */     this.a = ☃.i();
/* 30 */     int i = ☃.i();
/* 31 */     int j = ☃.i();
/* 32 */     StringRange stringRange = StringRange.between(i, i + j);
/*    */     
/* 34 */     int k = ☃.i();
/* 35 */     List<Suggestion> list = Lists.newArrayListWithCapacity(k);
/*    */     
/* 37 */     for (int m = 0; m < k; m++) {
/* 38 */       String str = ☃.e(32767);
/* 39 */       nr nr = ☃.readBoolean() ? ☃.h() : null;
/* 40 */       list.add(new Suggestion(stringRange, str, nr));
/*    */     } 
/*    */     
/* 43 */     this.b = new Suggestions(stringRange, list);
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(nf ☃) throws IOException {
/* 48 */     ☃.d(this.a);
/* 49 */     ☃.d(this.b.getRange().getStart());
/* 50 */     ☃.d(this.b.getRange().getLength());
/* 51 */     ☃.d(this.b.getList().size());
/*    */     
/* 53 */     for (Suggestion suggestion : this.b.getList()) {
/* 54 */       ☃.a(suggestion.getText());
/* 55 */       ☃.writeBoolean((suggestion.getTooltip() != null));
/* 56 */       if (suggestion.getTooltip() != null) {
/* 57 */         ☃.a(ns.a(suggestion.getTooltip()));
/*    */       }
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(om ☃) {
/* 64 */     ☃.a(this);
/*    */   }
/*    */   
/*    */   public int b() {
/* 68 */     return this.a;
/*    */   }
/*    */   
/*    */   public Suggestions c() {
/* 72 */     return this.b;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\pc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */