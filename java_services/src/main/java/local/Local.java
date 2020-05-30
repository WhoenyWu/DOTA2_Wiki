/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package local;

import java.util.HashMap;

import com.amazonaws.services.lambda.runtime.ClientContext;
import com.amazonaws.services.lambda.runtime.CognitoIdentity;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;

import lambda.GetRec;
import lambda.GetCache;
import lambda.PutCache;
import lambda.DropCache;
import lambda.DeleteCache;
import lambda.GetAbility;
import lambda.GetItem;
import lambda.GetPlayer;
import lambda.GetHero;

public class Local {

	// int main enables testing function from cmd line
	public static void main(String[] args) {
		Context c = new Context() {
			@Override
			public String getAwsRequestId() {
				return "";
			}

			@Override
			public String getLogGroupName() {
				return "";
			}

			@Override
			public String getLogStreamName() {
				return "";
			}

			@Override
			public String getFunctionName() {
				return "";
			}

			@Override
			public String getFunctionVersion() {
				return "";
			}

			@Override
			public String getInvokedFunctionArn() {
				return "";
			}

			@Override
			public CognitoIdentity getIdentity() {
				return null;
			}

			@Override
			public ClientContext getClientContext() {
				return null;
			}

			@Override
			public int getRemainingTimeInMillis() {
				return 0;
			}

			@Override
			public int getMemoryLimitInMB() {
				return 0;
			}

			@Override
			public LambdaLogger getLogger() {
				return new LambdaLogger() {
					@Override
					public void log(String string) {
						System.out.println("LOG:" + string);
					}
				};
			}
		};

		// Initialize request
		HashMap<String, Object> request = new HashMap<String, Object>();	

		
		//
		// GetRec test
		//
		
		// test case for GetRec
//		request.put("PrimaryAttribute", "All");
//		request.put("Fraction", "All");
//		request.put("HeroType", "All");
//		request.put("Complexity", "All");
//		request.put("PlayerName", "All");
		
		
//		GetRec getRec = new GetRec();
//		HashMap<String, Object> getRecResult = getRec.handleRequest(request, c);
//		System.out.println("GetRec result:\n" + getRecResult.toString());
    
		//
		// PutCache test
		//
		
		// test case for PutCache
//		request.put("HeroName", "All");
//		
//		
//		PutCache putCache = new PutCache();
//        HashMap<String, Object> putCacheResult = putCache.handleRequest(request, c);        
//        System.out.println("PutCache result:\n" + putCacheResult.toString());

		//
		// GetCache test
		//
		
		// test case for GetCache - no input
//		request.put("123", "123");
//		
//		GetCache getCache = new GetCache();
//        HashMap<String, Object> getCacheResult = getCache.handleRequest(request, c);        
//        System.out.println("GetCache result:\n" + getCacheResult.toString());

		
		//
		// DropCache test
		//
        
//        DropCache dropCache = new DropCache();
//        HashMap<String, Object> dropCacheResult = dropCache.handleRequest(request, c);     
//        System.out.println("DropCache result:\n" + dropCacheResult.toString());
        
       
		//
		// DeleteCache test
		//
		
		// test case for DeleteCache
//		request.put("HeroName", "Huskar");
//		
//		DeleteCache deleteCache = new DeleteCache();
//		HashMap<String, Object> deleteCacheResult = deleteCache.handleRequest(request, c);     
//		System.out.println("DeleteCache result:\n" + deleteCacheResult.toString());
		
		// test case for GetHero, GetItem, GetPlayer, GetItem
		
//		request.put("HeroName", "Huskar");
//		request.put("AbilityName", "Sun Strike");
//		request.put("AbilityName", "All");
//		request.put("ItemName", "Ocean Heart");
//		request.put("ItemName", "Apex");
//		request.put("PlayerName", "Zard-");
//		request.put("PlayerName", "All");
//		
		
        
        //
        // GetHero test
        //
        
//		GetHero getHero = new GetHero();
//        HashMap<String, Object> getHeroResult = getHero.handleRequest(request, c);        
//        System.out.println("GetHero result:\n" + getHeroResult.toString());
        
        //
        // GetAbility test
        //
        
//		GetAbility getAbility = new GetAbility();
//        HashMap<String, Object> getAbilityResult = getAbility.handleRequest(request, c);        
//        System.out.println("GetAbility result:\n" + getAbilityResult.toString());
        
        //
        // GetItem test
        //
        ///**************************************** HERE **********************************//
		request.put("ItemName", "Radiance");

		GetItem getItem = new GetItem();
        HashMap<String, Object> getItemResult = getItem.handleRequest(request, c);        
        System.out.println("GetItem result:\n" + getItemResult.toString());
        
        //
        // GetPlayer test
        //
        
//        GetPlayer getPlayer = new GetPlayer();
//        HashMap<String, Object> getPlayerResult = getPlayer.handleRequest(request, c);        
//        System.out.println("GetPlayer result:\n" + getPlayerResult.toString());
	}
}
